/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-01-15 05:00:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertLogbookEntry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/navbar.jsp", Long.valueOf(1705275814207L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Insert Logbook Records</title>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    table {\n");
      out.write("      border-collapse: collapse;\n");
      out.write("      width: 50%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td {\n");
      out.write("      padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input, select {\n");
      out.write("      width: 100%;\n");
      out.write("      border: none;\n");
      out.write("      border-bottom: 1px solid #000; /* You can adjust the color as needed */\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  ");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>iFleet</title>\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      overflow-x: hidden;\n");
      out.write("      font-family: \"Roboto\", sans-serif;\n");
      out.write("      font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Toggle Styles */\n");
      out.write("\n");
      out.write("    #viewport {\n");
      out.write("      padding-left: 250px;\n");
      out.write("      -webkit-transition: all 0.5s ease;\n");
      out.write("      -moz-transition: all 0.5s ease;\n");
      out.write("      -o-transition: all 0.5s ease;\n");
      out.write("      transition: all 0.5s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #content {\n");
      out.write("      width: 100%;\n");
      out.write("      position: relative;\n");
      out.write("      margin-right: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Sidebar Styles */\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("      z-index: 1000;\n");
      out.write("      position: fixed;\n");
      out.write("      left: 250px;\n");
      out.write("      width: 250px;\n");
      out.write("      height: 100%;\n");
      out.write("      margin-left: -250px;\n");
      out.write("      overflow-y: auto;\n");
      out.write("      background: #37474f;\n");
      out.write("      -webkit-transition: all 0.5s ease;\n");
      out.write("      -moz-transition: all 0.5s ease;\n");
      out.write("      -o-transition: all 0.5s ease;\n");
      out.write("      transition: all 0.5s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar header {\n");
      out.write("      background-color: #263238;\n");
      out.write("      font-size: 20px;\n");
      out.write("      line-height: 52px;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar header a {\n");
      out.write("      color: #fff;\n");
      out.write("      display: block;\n");
      out.write("      text-decoration: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar header a:hover {\n");
      out.write("      color: #fff;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar .nav {\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar .nav a {\n");
      out.write("      background: none;\n");
      out.write("      border-bottom: 1px solid #455a64;\n");
      out.write("      color: #cfd8dc;\n");
      out.write("      font-size: 14px;\n");
      out.write("      padding: 16px 24px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar .nav a:hover {\n");
      out.write("      background: none;\n");
      out.write("      color: #eceff1;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar .nav a i {\n");
      out.write("      margin-right: 16px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"viewport\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar\">\n");
      out.write("          <header>\n");
      out.write("            <a href=\"/home\">iFleet Management</a>\n");
      out.write("          </header>\n");
      out.write("          <ul class=\"nav\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"/license/\">\n");
      out.write("                <i class=\"zmdi zmdi-view-dashboard\"></i> License\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"/logbook/\">\n");
      out.write("                <i class=\"zmdi zmdi-link\"></i> Logbook\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"/\">\n");
      out.write("                <i class=\"zmdi zmdi-link\"></i> Log Out\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("              \n");
      out.write("             \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- Content -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("          <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\"><i class=\"zmdi zmdi-notifications text-danger\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">iFleet</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div style=\"padding-left: 260px\">\n");
      out.write("      <form action=\"/logbook/insert/new\" method=\"post\">\n");
      out.write("        <h1>Inserting Logbook Records</h1>\n");
      out.write("        <table>\n");
      out.write("          <tr>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"hidden\" name=\"driverName\" value=\"Luka\" />\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Driver Name:</td>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"text\" name=\"driverName\" value=\"Luka\" disabled />\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Type:</td>\n");
      out.write("            <td>\n");
      out.write("              <select name=\"type\">\n");
      out.write("                <option value=\"campus\">campus</option>\n");
      out.write("                <option value=\"reserved\">reserved</option>\n");
      out.write("              </select>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Date:</td>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"date\" name=\"date\" value=\"\" />\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Petrol: RM</td>\n");
      out.write("            <td>\n");
      out.write("              <input type=\"number\" step=\"any\" name=\"petrol\" value=\"\" />\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
      out.write("        <div style=\"margin-left: 400px;margin-top: 25px;\">\n");
      out.write("        <button type=\"submit\" style=\"border-radius: 0.5rem\" >Submit <i\n");
      out.write("          class=\"fa fa-paper-plane\"\n");
      out.write("          aria-hidden=\"true\"\n");
      out.write("        ></i\n");
      out.write("      ></button>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
