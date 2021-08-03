<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
</head>
<body>
<table align="center">
 <form id="depositForm"  modelAttribute="deposit" action="depositProcess"  method="post">
        
       
        <tr>
        <td>Enter the Amount:</td>
        <td><input type="text" name="amount"   pattern="^[0-9]+(\.[0-9]+)?$"
                           required = "required"/></td>
        </tr>
        <tr><td><input type="submit" value="Deposit"></td>
        </tr>
         <tr><td><input type="reset" value="Reset"></td>
         </tr>
         <td></td>
          <tr>
			<td> ${message}</td>
		</tr>
         </form>
</table>
</body>
</html>