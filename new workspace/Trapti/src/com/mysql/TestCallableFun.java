package com.mysql;

import java.sql.*;

public class TestCallableFun {
	public static void main(String[] args) throws Exception {
		testCallableFun();
	}

	private static void testCallableFun() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		CallableStatement callStmt = conn.prepareCall("{? = {CALL empCount()}}");
		callStmt.registerOutParameter(1, Types.INTEGER);
		callStmt.execute();
		int count = callStmt.getInt(1);
		System.out.println(count);
		conn.close();
		callStmt.close();
	}
}
