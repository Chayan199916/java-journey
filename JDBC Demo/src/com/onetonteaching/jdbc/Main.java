package com.onetonteaching.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String urlString = "jdbc:mysql://localhost:3306/demo";
		String usernameString = "root";
		String pwString = "mysql123";
//		String queryString = "select * from users where age = 21";
		String queryString = "select * from users";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // loading the mysql driver
			
			Connection connection = DriverManager.getConnection(urlString, usernameString, pwString); // creating the connection
			
			Statement statement = connection.createStatement(); // creating statement
			
			ResultSet resultSet = statement.executeQuery(queryString); // executing query
			
			while (resultSet.next()) { // processing result
				
				String nameString = resultSet.getString("name"); 
				int roll = resultSet.getInt("roll");
				int age = resultSet.getInt("age");
				
				System.out.println(nameString + ", " + roll + ", " + age);
				
			}
			
			statement.close(); // closing connection
			connection.close();	
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
