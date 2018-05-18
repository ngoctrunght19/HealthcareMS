<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor</title>
</head>
<body>
<p align="right"> 
    <b> Hello: <%=request.getAttribute("useraccount")%></b>
     <br>
     <b> Role: <%=request.getAttribute("role") %>    </b>
<p>
<div style="background: #E0E0E0; height: 35px; padding:5px;">  
	<h3> Patients' medical records are treated by you: </h3>
</div>
  <br>

	<table  align="center" border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Medical Record C</th>
          <th>pID</th>

          <th>View</th>
       </tr>
       <c:forEach items="${Patientlist}" var="mr" >
       	  <tr>
             <td>${mr.mrID}</td>
             <td>${mr.dID}</td> 
             <td>
                <a href="Patient?mrID=${mr.mrID}">View</a>
             </td>        
          </tr>  
       </c:forEach>  
    </table>
     <br>  <br> 
<div
  style="background: #E0E0E0; text-align: center; padding: 5px; margin-top: 10px;">
</div>

</body>
</html>