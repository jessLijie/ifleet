package my.utm.ip.spring_jdbc.Controller;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.utm.ip.spring_jdbc.Product;
import my.utm.ip.spring_jdbc.Model.License;

@Controller
@RequestMapping("/license")
public class LicenseController {
    @Autowired
    JdbcTemplate template;

    @RequestMapping("/")
    ModelAndView list() {
        ModelAndView mv = new ModelAndView("output");
        mv.addObject("title", "List Records");
        final List<String> result = new ArrayList<String>();
        String sql = "SELECT * FROM license";
        final List<License> list = template.query(sql,
                new BeanPropertyRowMapper<License>(License.class));
        for (License p : list) {
            result.add(p.toString());
        }
        mv.addObject("result", result);
        return mv;
    }

    // sample ans
    @RequestMapping("/jdbc-test")
    ModelAndView jdbcTest() {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<String>();
        result.add((template != null) ? "Passed" : "Failed");
        mv.addObject("title", "Loading JDBC");
        result.add(template.toString());
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("/insert")
    ModelAndView insert() {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<String>();
        String sql = "INSERT INTO products (name, category, details,"
                + "price, manufacturer) VALUES "
                + "('Laptop', 'Electronics', 'High-performance "
                + " laptop with 16GB RAM and 512GB SSD.', "
                + "999.99, 'ABC Electronics'), "
                + "('Smartphone', 'Electronics', '5.5-inch "
                + "display, 128GB storage, dual camera.', "
                + "499.99, 'XYZ Mobiles'), "
                + "('Desk Chair', 'Furniture', 'Ergonomic "
                + "chair with adjustable height and lumbar support.', "
                + "129.99, 'Comfort Furniture'), "
                + "('Coffee Maker', 'Appliances', 'Programmable "
                + " coffee maker with 12-cup capacity.', "
                + "49.99, 'Home Appliances Co.'), "
                + "('Running Shoes', 'Clothing', 'High-performance "
                + "running shoes for all types of terrain.', "
                + "79.99, 'Sports Gear Inc.');";
        int count = template.update(sql);
        result.add(count + " records have been inserted");
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("/insert-get-id")
    ModelAndView getIdFromInsert() {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<String>();
        mv.addObject("title", "Getting Auto-Generated Id from Insert");
        String sql = "INSERT INTO products (name, category, details, price, manufacturer) VALUES (?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int count = template.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "Gaming Console");
            ps.setString(2, "Electronics");
            ps.setString(3, "Next-gen gaming console with 1TB storage.");
            ps.setDouble(4, 399);
            ps.setString(5, "GameTech Systems");
            return ps;
        }, keyHolder);
        Long generatedId = Objects.requireNonNull(keyHolder.getKey()).longValue();

        result.add(count + " product has been added.");
        result.add("with generated id: " + generatedId);
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("/fetch")
    ModelAndView fetch(@RequestParam String id) {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<String>();
        String sql = "SELECT * FROM products WHERE id=?";
        try {
            Product product = template.queryForObject(sql, new BeanPropertyRowMapper<Product>(Product.class), id);
            result.add("Object found: " + product.toString());
        } catch (EmptyResultDataAccessException e) {
            result.add("No object found for ID: " + id);
        } catch (IncorrectResultSizeDataAccessException e) {
            result.add("More than one object found for ID: " + id);
        }

        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("/delete")
    ModelAndView delete(@RequestParam String id) {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<String>();
        String sql = "DELETE FROM products WHERE id=?";
        int count = template.update(sql, id);
        result.add(count + " item has been deleted");
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping("/update")
    ModelAndView update(@RequestParam String id,
            @RequestParam String field,
            @RequestParam String value) {
        ModelAndView mv = new ModelAndView("output");
        final List<String> result = new ArrayList<>();

        String sql = "UPDATE products SET " + field + "=? WHERE id=?";
        int count = template.update(sql, value, id);

        if (count > 0) {
            result.add("Record with ID " + id + " updated successfully.");
        } else {
            result.add("No record found for update with ID: " + id);
        }

        mv.addObject("result", result);
        return mv;
    }
}
