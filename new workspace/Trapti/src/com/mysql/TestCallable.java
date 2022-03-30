package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class TestCallable {
	public static void main(String[] args) throws Exception {
		testCallable();
	}

	private static void testCallable() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		CallableStatement callStmt = conn.prepareCall("{CALL empCount(?)}");
		callStmt.registerOutParameter(1, Types.INTEGER);
		callStmt.execute();
		int count = callStmt.getInt(1);
		System.out.println("Count " + count);
		conn.close();
		callStmt.close();
	}

}
