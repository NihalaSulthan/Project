

//Java program to use Callable Statement
//in Java to call Stored Procedure

package JDBC;

import java.sql.*;

public class CallableStatement {

	public static void main(String[] args) {
		try {

		// Getting the connection
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking?autoReconnect=true&useSSL=false", "root", "root");
		
	Statement s= con.createStatement();
	
		// Preparing a CallableStateement
		CallableStatement cs = con.prepareCall("{call get_customer()}");
		
		cs.execute();
ResultSet result =cs.executeQuery();
while(result.next()) {
	System.out.println("CustID: "+result.getInt(1) + "Firstname: " +result.getString(1) + "LastName" +result.getString(2) + "Area: " +result.getString(3) + " Phone" +result.getInt(4) +"email: " +result.getString(5));
	}
}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}
