package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import com.rays.bean.EmployeeBean;

public class EmployeeModel {

	public void add(EmployeeBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES (?, ?, ?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getSalary());
		int i = ps.executeUpdate();
		System.out.println(i);
		

		conn.close();
		ps.close();
	}

}
