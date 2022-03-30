package com.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class MarksheetModalMer {

	public Integer nextPk() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("SELECT ID,ROLL_NO,FIRST_NAME,LAST_NAME,PHYSICS,CHEMISTRY,MATHS,(PHYSICS + CHEMISTRY + MATHS) AS TOTAL , (PHYSICS + CHEMISTRY + MATHS)/3 AS PERCENTAGE FROM MARKSHEET ORDER BY (PHYSICS + CHEMISTRY + MATHS) ORDER BY LIMIT 5");

		conn.setAutoCommit(false);

		int pk = 0;

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement("select MAX(ID) from MARKSHEET");

		ResultSet i = ps.executeQuery();

		while (i.next()) {
			pk = i.getInt(1);
		}

		conn.commit();
		System.out.println(i + "Inserted");

		ps.close();
		conn.close();
		return pk + 1;

	}

	public List<MarksheetBean> getMeritList() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(
				"SELECT PHYSICS + CHEMISTRY + MATHS AS TOTAL,(PHYSICS + CHEMISTRY + MATHS)/3 AS PERCENT FROM MARKSHEET ORDER BY TOTAL DESC");

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
