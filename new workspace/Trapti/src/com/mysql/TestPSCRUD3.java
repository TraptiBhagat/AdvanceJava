package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPSCRUD3 {
	public static void main(String[] args) throws Exception {
		testDel();

	}

	private static void testDel() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		int id = 5;
		String name = "Jaya Sharma";
		int salary = 8000;

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("UPDATE EMPLOYEE SET NAME = ?, SALARY = ? WHERE ID = ?");
		ps.setString(1, name);
		ps.setInt(2, salary);
		ps.setInt(3, id);

		int i = ps.executeUpdate();
		System.out.println(i);
		ps.close();
		conn.close();
	}

}
