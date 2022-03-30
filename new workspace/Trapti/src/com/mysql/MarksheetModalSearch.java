package com.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class MarksheetModalSearch {
	public List<MarksheetBean> search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn
				.prepareStatement("SELECT ID, ROLL_NO,FNAME, LNAME, PHYSICS, CHEMISTRY, MATHS FROM MARKSHEET");
		ResultSet rs = ps.executeQuery();

		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {

			MarksheetBean bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getInt(2));
			bean.setFname(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhysics(rs.getInt(5));
			bean.setChemistry(rs.getInt(6));
			bean.setMaths(rs.getInt(7));

			list.add(bean);
		}

		conn.commit();
		ps.close();
		conn.close();
		return list;

	}
}
