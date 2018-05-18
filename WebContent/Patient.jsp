<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient</title>
</head>
<body>
<p align="right">  
    <b> Hello: <%=session.getAttribute("useraccount")%></b>
     <br>
     <b> Role: <%=session.getAttribute("role") %>    </b>
<p>

<div style="background: #E0E0E0; height: 35px; padding: 5px;">
</div>
  <br/>

<p style="color: red;">${errorString}</p>

<form action = "PatientFormServlet" method = "post">
	<table>
		<tr>
			<td> <label> Medical record index: </label></td>
			<td> <input type = "text" name = "mrID">	</td>
		</tr>
		<tr>
			<td> <input type = "submit" value = "View"></td>
		</tr>
	</table>
</form>

<div
  style="background: #E0E0E0; text-align: center; padding: 5px; margin-top: 10px;">
</div>

</body>
</html>