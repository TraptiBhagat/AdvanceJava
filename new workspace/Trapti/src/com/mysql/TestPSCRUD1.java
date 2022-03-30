package com.mysql;

import java.sql.*;

public class TestPSCRUD1 {
	public static void main(String[] args) throws Exception {
		testSelect();
	}

	private static void testSelect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM EMPLOYEE");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));

		}
		rs.close();

		ps.close();
		conn.close();

	}

}
