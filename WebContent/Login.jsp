<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<div style="background: #E0E0E0; height: 45px; padding: 5px;">
  <div style="float: left">
     <h2>Login the system: </h2><br>
  </div>
</div>
<br/>

<p style="color: red;">${errorString}</p>

<form action = "LoginFormServlet" method = "post">
	<table>
		<tr>
			<td> <label> User Account: </label></td>
			<td> <input type = "text" name = "useraccount">	</td>
		</tr>
		<tr>
			<td> <label> Password:  </label>	</td>
			<td> <input type = "password" name = "password">	</td>
		</tr>
		<tr>
			<td> <label> Role:  </label>	</td>
			<td> <input type = "text" name = "role">	</td>
		</tr>
		<tr>
			<td> <input type = "submit" value = "Login"></td>
		</tr>
	</table>
</form>

<div
  style="background: #E0E0E0; text-align: center; padding: 5px; margin-top: 10px;">
</div>
</body>
</html>
