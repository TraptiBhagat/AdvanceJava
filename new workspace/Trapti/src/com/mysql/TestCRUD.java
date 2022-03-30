package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {
	public static void main(String[] args) throws Exception {
		//testSelect();
		testGet(2);
		//testAdd();

	}

	private static void testGet( int i) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stmt = conn.createStatement();
		//int i = stmt.executeUpdate("UPDATE EMPLOYEE SET NAME = 'TRAPTI BHAGAT' WHERE ID  = 4");
		 ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE ID = " + i);
		while (rs.next()) {
			
			 System.out.print("\t" + rs.getString(1)); 
			 System.out.print("\t" +rs.getString(2)); 
			 System.out.println("\t" + rs.getString(3));
			 
		}
		rs.close();
		//System.out.println(i + "Inserted Value");
		stmt.close();
		conn.close();

	}

}
