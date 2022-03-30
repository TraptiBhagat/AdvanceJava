package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class TestPSCRUD {
	public static void main(String[] args) throws Exception {
		testUpdate();

	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		int id = 7;
		String name = "Jaya Verma";
		int salary = 12000;

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT into employee values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		int i = ps.executeUpdate();
		System.out.println(i);
		ps.close();
		conn.close();
	}
}
