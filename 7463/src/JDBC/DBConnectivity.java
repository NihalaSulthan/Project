package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class DBConnectivity { 
	public static final  String CREATE_TABLE ="CREATE TABL User("+"	USER_ID int(10) NOT NULL,"+" Firstname VARCHAR(20) NOT NULL,"+" Lastname VARCHAR(20) NOT NULL, "+" Phone BIGINT(10) NOT NULL, "+" Email VARCHAR(20) NOT NULL)";
			public static void main(String[] args) throws ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/booking?useSSL=false";
		String username= "root";
		String password= "root";
		Connection connect=null;
		PreparedStatement statement =null;
		Class.forName("com.mysql.cj.jbc.Driver");
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			connect=DriverManager.getConnection(url, username, password);
			
		
			statement =connect.prepareStatement(CREATE_TABLE);
		statement.executeUpdate();
		
		
			System.out.println("Table created");
		}
	catch(SQLException e){
		e.printStackTrace();
		}
			
			finally {
				try {
					if(statement !=null) {
						statement.close();
					}
					if(connect!=null) {
						connect.close();
					}
				}
		catch(Exception e)
				{
			e.printStackTrace();
				}
		
	}

}}


