package service;

import com.db;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Model.Item_m;

public class item_services {
		
		private static Connection connection;

		//private static Statement statement;
		private static PreparedStatement preparedStatement;
		
		public String insertItem(Item_m b)

		{ 
		 String output = ""; 
		try
			 { 
			 Connection con = connect(); 
			 if (con == null) 
			 { 
		 return "Error while connecting to the database"; 
		 } 
			 // create a prepared statement
			 String query = " insert into items(`itemID`,`itemCode`,`itemName`,`itemPrice`,`itemDesc`)"
			 + " values (?, ?, ?, ?, ?)"; 
			 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
			 // binding values
			 preparedStmt.setInt(1, 0); 
			 preparedStmt.setInt(2, b.getCode());
			 preparedStmt.setString(3, b.getName()); 
			 preparedStmt.setDouble(4, b.getPrice()); 
			 preparedStmt.setString(5, b.getDesc());
			//execute the statement
			 preparedStmt.execute(); 
			 con.close(); 
			 output = "Inserted successfully"; 
		 } 
		catch (Exception e) 
		 { 
			 output = "Error while inserting"; 
			 System.err.println(e.getMessage()); 
		 } 
		return output; 
		}

		private Connection connect() {
			// TODO Auto-generated method stub
			return null;
		}


		

}