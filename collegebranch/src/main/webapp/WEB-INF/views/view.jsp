<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="form" align="center">
<form action="/view" method="get">
<table>
<tr>
<th>Branch ID</th>
<th>Branch Name</th>
<th>Total Strength</th>
<th>HOD Name</th>

 

</tr>
<c:forEach var="xyz" items="${branch}">
<tr>
<td>${xyz.branchId}</td>
<td>${xyz.branchName}</td>
<td>${xyz.totalStrength}</td>
<td>${xyz.hodName}</td>
<td><a href="/update/${xyz.branchId}">Update</a></td>
</tr>
<br>
</c:forEach>
</table>
<div class="container" style="text-align:center">
<a href="/" class="btn btn-info" role="button">Click to go to Homepage</a>

 

</div>
<br>
</form>
</div>
</body>
</html>