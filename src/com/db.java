package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itp", "root", "");
			if (!con.isClosed())
				System.out.println("Successfully connected to MYSQL server...");
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} 		
		return con;
	}
}

