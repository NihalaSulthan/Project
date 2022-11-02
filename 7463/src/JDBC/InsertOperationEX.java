package JDBC;

import java .sql.*;
import java.util.Scanner;

public class InsertOperationEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Custid:");
			String CustID = sc.nextLine();
			System.out.println("Enter FirstName:");
			String FirstName = sc.nextLine();
			System.out.println("Enter LastName");
			String LastName = sc.nextLine();
			System.out.println("Address:");
			String Area = sc.nextLine();
			
			System.out.println("Phone:");
			String Phone = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement pst = connect.prepareStatement("insert into customer(CustID,FirstName,LastName,Area,Phone,email) values(?,?,?,?,?,?)");
			
			pst.setString(1, CustID);
			pst.setString(2, FirstName);
			pst.setString(3, LastName);
			pst.setString(4, Area);
			pst.setString(5, Phone);
			pst.setString(6, email);
			
			int i = pst.executeUpdate();
			System.out.println(i + "rows affected");
			if(i!=0)
			{
				System.out.println("record succesfully added");
			}
			else
			{
				System.out.println("failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
