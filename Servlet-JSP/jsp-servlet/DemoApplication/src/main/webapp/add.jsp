<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage = "err.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition goes here : </title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1")); /* request is implicit object*/
		int num2 = Integer.parseInt(request.getParameter("num2")); 
		
		int result = num1 + num2;
		
		result /= 0;
		
		out.println(result);
	%>
</body>
</html>