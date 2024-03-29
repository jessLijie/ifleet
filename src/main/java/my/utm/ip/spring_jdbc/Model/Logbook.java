package my.utm.ip.spring_jdbc.Model;

import java.sql.Date;

public class Logbook {
  private int logbookID;
  private String driverName;
  private String type;
  private Date date;
  private Double petrol;
  private String campusRoute;
  private String reservedDest;
  private String reservedDepart;
  private Double reservedToll;
  private Double reservedMileage;

  public Logbook() {
    this.logbookID = 0;
    this.driverName = "";
    this.type = "";
    this.date = null;
    this.petrol = 0.00;
    this.campusRoute = "";
    this.reservedDest = "";
    this.reservedDepart = "";
    this.reservedToll = 0.00;
    this.reservedMileage = 0.00;
}

  
public Logbook(int logbookID, String driverName, String type, Date date, Double petrol, String campusRoute,
        String reservedDest, String reservedDepart, Double reservedToll, Double reservedMileage) {
    this.logbookID = logbookID;
    this.driverName = driverName;
    this.type = type;
    this.date = date;
    this.petrol = petrol;
    this.campusRoute = campusRoute;
    this.reservedDest = reservedDest;
    this.reservedDepart = reservedDepart;
    this.reservedToll = reservedToll;
    this.reservedMileage = reservedMileage;
}
public int getLogbookID() {
    return logbookID;
}
public void setLogbookID(int logbookID) {
    this.logbookID = logbookID;
}
public String getDriverName() {
    return driverName;
}
public void setDriverName(String driverName) {
    this.driverName = driverName;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public Date getDate() {
    return date;
}
public void setDate(Date date) {
    this.date = date;
}
public Double getPetrol() {
    return petrol;
}
public void setPetrol(Double petrol) {
    this.petrol = petrol;
}
public String getCampusRoute() {
    return campusRoute;
}
public void setCampusRoute(String campusRoute) {
    this.campusRoute = campusRoute;
}
public String getReservedDest() {
    return reservedDest;
}
public void setReservedDest(String reservedDest) {
    this.reservedDest = reservedDest;
}
public String getReservedDepart() {
    return reservedDepart;
}
public void setReservedDepart(String reservedDepart) {
    this.reservedDepart = reservedDepart;
}
public Double getReservedToll() {
    return reservedToll;
}
public void setReservedToll(Double reservedToll) {
    this.reservedToll = reservedToll;
}
public Double getReservedMileage() {
    return reservedMileage;
}
public void setReservedMileage(Double reservedMileage) {
    this.reservedMileage = reservedMileage;
}

@Override
public String toString() {
    return "Logbook [logbookID=" + logbookID + ", driverName=" + driverName + ", type=" + type + ", date=" + date
            + ", petrol=" + petrol + ", campusRoute=" + campusRoute + ", reservedDest=" + reservedDest
            + ", reservedDepart=" + reservedDepart + ", reservedToll=" + reservedToll + ", reservedMileage="
            + reservedMileage + "]";
}

}
