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
 <b> Your medical record:</b>
</div>
  <br/>

<table align = "left" border="0" cellpadding="5" cellspacing="1" >
       <tr>
          <td>Medical Record Code: </td>
          <td>${mr.mrID}</td>          
       </tr>
        <tr>
          <td>Patient Code: </td>
          <td>${mr.pID}</td>          
       </tr>
       <tr>
          <td>Doctor Code: </td>
          <td>${mr.dID}</td>          
       </tr>
       <tr>
          <td>Contents: </td>
          <td>${mr.content}</td>          
       </tr>       
    </table>
     <br/>  <br/> <br/>  <br/> <br/>  <br/> <br/>
<div
  style="background: #E0E0E0; text-align: center; padding: 5px; margin-top: 10px;">
</div>

</body>
</html>