<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user</title>
<center><h1>Login Successfully</h1></center>
<center><h2>Welcome ${firstname }</h2></center>
</head>
<body>
<form:form id="sumForm"  modelAttribute="summary" action="summaryProcess" method="POST" >
<table align="center">
<tr>
<td><input type="submit" value="summary"></input></td>
</tr>
<tr>
<td><a href="deposit.jsp">Deposit</a></td>
</tr>
<tr>
<td><a href="withdraw.jsp?value=wit">Withdraw</a></td>
</tr>
<td></td>
<tr>
<td><a href="${pageContext.request.contextPath }/login">Logout</a></td>
</tr>
<tr>
<td style="font-style: italic; color: red;">${message}</td>
</tr>
</table>
</form:form>
</body>
</html>