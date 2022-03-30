package in.co.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.bean.RegistrationBean;

import java.sql.DriverManager;

public class RegistrationModel {
	
	public void add(RegistrationBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO USER VALUES(?,?,?,?,?,?)");
		ps.setString(1, bean.getId());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getPhone());
		ps.setString(5, bean.getEmail());
		ps.setString(6, bean.getPassword());

		int i = ps.executeUpdate();
		System.out.println(i);
		conn.close();
		ps.close();
	}
}
