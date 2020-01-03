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
<div class="form1" align="center">
<form action="insertbranch" method="post" id="form1">
<table>
<tr align="center">
<td>College</td>
<td><select name="collegeName">
<c:forEach var="college" items="${college}">
<option value="${college.collegeName}">${college.collegeName}</option>
</c:forEach>
</select></td>
</tr>
<tr></tr>
</table>
<hr>
<br>

 

<table>
<tr>
<td>Branch name</td>
<td><input id="branchName" name="branchName"></td>
</tr>
<tr>
<td>Total Strength</td>
<td><input id="branchTotalStrength" name="branchTotalStrength"></td>
</tr>
<tr>
<td>HOD Name</td>
<td><input id="branchHod" name="branchHod"></td>
</tr>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form>

 

</div>
<p align="center">
<a href="/"><button>Back To Homepage</button></a>
</p>
</body>
</html>