package com.RB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i <=15; i++) {
			System.out.println("For User = " + i);
			testJdbc();
		}
	}
	public static void testJdbc() throws SQLException {
		String sql = "SELECT * FROM MARKSHEET";
		Connection co = JDBCDataSource.getConnection();
		PreparedStatement s = co.prepareStatement(sql);
		ResultSet rs = s.executeQuery();
		
		while(rs.next()) {
			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getInt(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.print("\t" + rs.getInt(6));
			System.out.println("\t" + rs.getInt(7));
		}
		
	}
}
