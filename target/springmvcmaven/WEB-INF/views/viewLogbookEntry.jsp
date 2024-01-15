<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Logbook Records</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
    />
    <style>
      table {
        border-collapse: collapse;
        width: 100%;
        margin-top: 20px;
        background-color: white;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }

      thead tr th {
        text-align: center;
      }
      th,
      td {
        border: 1px solid #dddddd;
        text-align: center;
        padding: 12px;
      }

      th {
        background-color: #343a40;
        color: white;
      }

      tr:nth-child(even) {
        background-color: #f2f2f2;
      }

      tr:hover {
        background-color: #000000;
        color: #ffffff;
      }
      .details-section {
        display: none;
        margin-top: 20px;
      }

      .details-content {
        padding: 10px;
        background-color: #f2f2f2;
      }
    </style>
  </head>
  <%@include file="navbar.jsp"%>
  <body>
    <div style="padding-left: 260px">
      <c:if test="${not empty successMessage}">
        <div class="alert alert-success">${successMessage}</div>
      </c:if>

      <h1>Logbook Records</h1>

      <table>
        <thead>
          <tr>
            <th>Logbook ID</th>
            <th>Driver Name</th>
            <th>Type</th>
            <th>Date</th>
            <th>Petrol</th>
            <th>Action</th>
            <!-- <th>Campus Route</th>
                <th>Reserved Dest</th>
                <th>Reserved Depart</th>
                <th>Reserved Toll</th>
                <th>Reserved Mileage</th> -->
          </tr>
        </thead>
        <tbody>
          <c:forEach var="logbook" items="${logbookList}">
            <tr>
              <td>${logbook.logbookID}</td>
              <td>${logbook.driverName}</td>
              <td>${logbook.type}</td>
              <td>${logbook.date}</td>
              <td>${logbook.petrol}</td>
              <td>
                <a href="edit/${logbook.logbookID}"
                  ><i
                    class="fa fa-pencil"
                    aria-hidden="true"
                    style="color: forestgreen"
                  ></i
                ></a>

                <span>&nbsp</span>
                <a href=""
                  ><i
                    class="fa fa-trash"
                    aria-hidden="true"
                    style="color: red"
                  ></i
                ></a>
              </td>

              <!-- <td>${logbook.campusRoute}</td>
                    <td>${logbook.reservedDest}</td>
                    <td>${logbook.reservedDepart}</td>
                    <td>${logbook.reservedToll}</td>
                    <td>${logbook.reservedMileage}</td> -->
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>
