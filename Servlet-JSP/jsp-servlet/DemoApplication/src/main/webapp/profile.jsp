<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
		String url = "jdbc:postgresql://localhost:5432/survey_database";
		String sql = "SELECT * FROM data";
		String password = "0";
		String username = "postgres";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		
	%>
	
	email : <%= rs.getString(2) %>
	height : <%= rs.getInt(3) %>
	weight : <%= rs.getInt(4) %>
	
</body>
</html>