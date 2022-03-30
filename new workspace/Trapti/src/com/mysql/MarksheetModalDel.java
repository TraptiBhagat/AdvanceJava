package com.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

public class MarksheetModalDel {
	public MarksheetBean del(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ID = ?");
		ps.setInt(1, bean.getId());

		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i + "Deleted");

		ps.close();
		conn.close();
		return bean;
	}
}
