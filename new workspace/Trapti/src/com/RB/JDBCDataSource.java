package com.RB;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {

	private static JDBCDataSource jds = null;

	private ComboPooledDataSource ds = null;

	private JDBCDataSource() {

		try {

			ResourceBundle rb = ResourceBundle.getBundle("com.RB.app");

			ds = new ComboPooledDataSource();

			ds.setDriverClass(rb.getString("Driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("username"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(10);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}

	}
	public static JDBCDataSource getInstance() {
		if (jds == null) {

			jds = new JDBCDataSource();
		}
		return jds;
	}
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}
	public static void closeConnection(Connection co, Statement s, ResultSet r) {
		try {
			if (r != null)
				r.close();
			if (s != null)
				s.close();
			if (co != null)
				co.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeConnection(Connection co, Statement s) {
		closeConnection(co, null);
	}

	public static void closeConnection(Connection co) {
		closeConnection(co, null, null);
	}

}