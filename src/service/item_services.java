package service;

import java.sql.SQLException;

import com.db;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Model.Item_m;
import com.db;
import Model.Item_m;

public class item_services {
		
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	public void insertItem(Item_m b) {
	
		   
        try {
            connection = db.getConnection();
            System.out.println("connected to db");
       
            String sql  = "INSERT INTO item(Code,Name,Price,Desc) Values(?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
       
            preparedStmt.setInt(1, 0); 
            preparedStmt.setInt(2, b.getCode());
            preparedStmt.setString(3, b.getName()); 
            preparedStmt.setDouble(4, b.getPrice()); 
            preparedStmt.setString(5, b.getDesc());

           
            preparedStatement.execute();
            System.out.println("inserted Successfully");
            //connection.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    
	 
	}
	
	
	public void updatebuyingItem(Item_m y) {
		try {
		connection = db.getConnection();
		System.out.println("connected to db");
		
		
		String sql = "UPDATE item set Name=?,Price=?,Desc=? where Code=?";
		preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
	
		preparedStmt.setInt(1, 0); 
        preparedStmt.setInt(2, y.getCode());
        preparedStmt.setString(3, y.getName()); 
        preparedStmt.setDouble(4, y.getPrice()); 
        preparedStmt.setString(5, y.getDesc());
		
		
		 preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public void deleteItem(Item_m y) {
		
		try {
			connection = db.getConnection();
			System.out.println("connect to db");
			
			String sql4 = "DELETE FROM  item  where Code=?";
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql4);
			preparedStatement.setInt(1,y.getCode());
		
			preparedStatement.execute();
				System.out.println("Deleted Successfully");	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
	

}



