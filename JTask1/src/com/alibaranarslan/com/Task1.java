package com.alibaranarslan.com;

import java.sql.*;

public class Task1 {

	public static void main(String[] args) {
	
		String jbcUrl = "jdbc:postgresql://localhost:5432/Task1";
		String user = "postgres";
		String password = "2451";
		
		try {
			
			
			Connection connection = DriverManager.getConnection(jbcUrl,user,password);
			System.out.println("Connection of PostgreSQSL is success");
			
			String sq1 = "INSERT INTO customer (id , name , surname , email , phone)" 
			+ " VALUES ('12341' , 'Mehmet' , 'Yaz' , 'mehmetyazzzz.gmail.com ' , '5555555555')";
			
			Statement statement = connection.createStatement();
			
			int rows = statement.executeUpdate(sq1); 
			
			if( rows > 0 ) {
				
				System.out.println("New person has been inserted");
			}
			
			connection.close();
	
			
		} catch (SQLException e) {
			
			System.out.println("Error in connecting to PostgreSQL server");
			System.out.println(e);
		}

	}

}
