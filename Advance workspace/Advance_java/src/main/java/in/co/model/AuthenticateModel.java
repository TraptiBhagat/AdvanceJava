package in.co.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.bean.AuthenticateBean;

public class AuthenticateModel {
	public AuthenticateBean Authenticate(AuthenticateBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM USER WHERE ID = ? and PASSWORD = ?");

		ps.setString(1, bean.getId());

		ps.setString(2, bean.getPassword());
		ResultSet i = ps.executeQuery();
		System.out.println(i);

		conn.close();
		ps.close();
		return bean;

	}

	
}

