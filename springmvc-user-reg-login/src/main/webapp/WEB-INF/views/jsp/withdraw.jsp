<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw</title>
</head>
<body>
<form id="withdrawForm"  modelAttribute="withdraw" action="withdrawProcess"  method="post">
<table align="center">

        <tr>
        <td>Enter the Amount:</td>
        <td><input type="text" name="amount"  pattern="^[0-9]+(\.[0-9]+)?$"
                           required = "required"/></td>
        </tr>
        <tr><td><input type="submit" value="Withdraw"></td>
        </tr>
         <tr><td><input type="reset" value="Reset"></td>
         </tr>
         <td></td>
          <tr>
			<td> ${message}</td>
		</tr>
</table>
</body>
</html>