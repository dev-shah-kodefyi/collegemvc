<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <html>
  <head>
  <meta http-equiv="Content-Type" content="text/html">
  <title>Insert</title>
  </head>
  <body>
  <div class="form">
  <form action="/updatebranchdetails" method="post">
  <table>
  <tr>
  <td>Enter branch name</td>
  <td><input type="text" id="branchName" name="branchName" value="${branch.getBranchName()}"></td>
  </tr>
  <tr>
  <td>Enter branch total strength</td>
  <td><input type="number" id="totalStrength" name="totalStrength" value="${branch.getTotalStrength()}"></td>
  </tr>
 
  <tr>
  <td><input type="submit" value="insert" /></td>
  </tr>
  </table>
  </form>
  <p align="center">
  <a href="/"><button>Back to Homepage</button></a>
  </div>
  </body>
  </html>
 
  </body>
 
 
  </html>