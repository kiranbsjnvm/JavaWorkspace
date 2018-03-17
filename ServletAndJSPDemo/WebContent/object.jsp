<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String username = request.getParameter("name");

if(username !=null){
	session.setAttribute("sessionUserName", username);
	application.setAttribute("applicationUserName", username);
}
%>

The user name : <%= username %>
<br>
The user name from Session: <%= session.getAttribute("sessionUserName") %>
<br>
The user name from application context : <%= application.getAttribute("applicationUserName") %>
<br>




</body>
</html>