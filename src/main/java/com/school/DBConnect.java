package com.school;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static String url = "jdbc:mysql://localhost:3306/school_info_management_system";
	private static String username = "root";
	private static String password = "root";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e){
			System.out.println("Databse connection is un-successfull");
		}
		return con;
	}
}