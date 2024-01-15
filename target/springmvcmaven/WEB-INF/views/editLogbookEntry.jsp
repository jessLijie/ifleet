<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Edit Logbook Records</title>
  </head>
  <%@include file="navbar.jsp"%>
  <body>
    <div style="padding-left: 260px">
      <form action="/logbook/update/${logbook.logbookID}" method="post">
        <h1>Editing Logbook Records</h1>
        <input type="hidden" name="driverName" value="${logbook.driverName}" />
        <input type="hidden" name="type" value="${logbook.type}" />
        Driver Name:
        <input
          type="text"
          name="driverName"
          value="${logbook.driverName}"
          disabled
        />
        <br />
        Type:
        <input type="text" name="type" value="${logbook.type}" disabled />
        <br />
        Date: <input type="date" name="date" value="${logbook.date}" /> <br />
        Petrol: <input type="number" step="any" name="petrol" value="${logbook.petrol}" />
        <br />
        <c:if test="${logbook.type eq 'campus'}">
            Campus Route:
            <input type="text" name="campusRoute" value="${logbook.campusRoute}" />
            <input type="text" name="reservedDest" value="${logbook.reservedDest}" hidden/> <br />
            <input type="text" name="reservedDepart" value="${logbook.reservedDepart}" hidden/> <br />
            <input type="number" step="any" name="reservedToll" value="${logbook.reservedToll}" hidden/> <br />
            <input type="number" step="any" name="reservedMileage" value="${logbook.reservedMileage}"hidden /> <br />
        </c:if>

        <c:if test="${logbook.type eq 'reserved'}">
            <input type="text" name="campusRoute" value="${logbook.campusRoute}" hidden/>
            Destination:
            <input type="text" name="reservedDest" value="${logbook.reservedDest}" /> <br />
            Departure Point:
            <input type="text" name="reservedDepart" value="${logbook.reservedDepart}" /> <br />
            Toll Fare:
            <input type="number" step="any" name="reservedToll" value="${logbook.reservedToll}" /> <br />
            Mileage:
            <input type="number" step="any" name="reservedMileage" value="${logbook.reservedMileage}" /> <br />
        </c:if>
        
        <br />
        <button type="submit" style="border-radius: 0.5rem">Update</button>
      </form>
    </div>
  </body>
</html>
