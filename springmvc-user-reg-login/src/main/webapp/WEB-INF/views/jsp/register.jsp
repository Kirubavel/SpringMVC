 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script> 
function validate()
{    
	 var username = document.Form.username.value;
	 var firstname = document.Form.firstname.value;
     var lastname = document.Form.lastname.value;
     var email = document.Form.email.value;
     var password = document.Form.password.value;
     var confirmpassword= document.Form.confirmpassword.value;
     var phone = document.Form.phone.value; 
     
     
     if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if (firstname==null || firstname=="")
     { 
     alert("FirstName can't be blank"); 
     return false; 
     }
     else if (lastname==null || lastname=="")
     { 
     alert("LastName can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (password!=confirmpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
     else if (phone==null || phone=="")
     { 
     alert("Phone can't be blank"); 
     return false; 
     }
 } 
</script> 
</head>



<body>

	<form:form id="regForm" name="Form" modelAttribute="user" action="registerProcess"
		method="post" onsubmit="return validate()">

		<table align="center">
		    
			<tr>
					<td>Username</td>
				<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Firstname</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td>Lastame</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>email</td>
					<td><input type="email" name="email" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Confirmpassword</td>
					<td><input type="password" name="confirmpassword" /></td>
				</tr>
			
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
			

			<tr>
				<td></td>
				<td><input type="submit" value="Register"></input>
				<input type="reset" value="Reset"></input></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
