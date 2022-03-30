package com.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;

public class MraksheetModalUp {
	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(
				"UPDATE MARKSHEET SET ROLL_NO = ?, FNAME = ?, LNAME = ?, PHYSICS = ?, CHEMISTRY = ?, MATHS = ? WHERE ID = ?");

		ps.setInt(1, bean.getRollno());
        ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		ps.setInt(7, bean.getId());

		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i + "Updated");

		ps.close();
		conn.close();

	}
}
