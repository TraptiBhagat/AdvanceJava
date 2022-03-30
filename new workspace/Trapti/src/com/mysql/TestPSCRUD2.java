package com.mysql;

import java.sql.*;

public class TestPSCRUD2 {
	public static void main(String[] args) throws Exception {
		testSelect();
	}

	private static void testSelect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		int id = 7;

		PreparedStatement ps = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println(i);
		conn.close();
		ps.close();

	}
}
