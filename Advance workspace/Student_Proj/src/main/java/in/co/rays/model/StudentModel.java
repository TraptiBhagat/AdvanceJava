package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.StudentBean;

public class StudentModel {
	public int nextPK() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM STUDENT");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			pk = rs.getInt(1);
		}

		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?)");

			ps.setInt(1, nextPK());
			ps.setString(2, bean.getRollNo());
			ps.setString(3, bean.getFirstName());
			ps.setString(4, bean.getLastName());
			ps.setString(5, bean.getSession());

			int i = ps.executeUpdate();
			System.out.println(i);
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(StudentBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = (PreparedStatement) conn
				.prepareStatement("UPDATE STUDENT SET FIRST_NAME = ?, LAST_NAME = ?, SESSION = ? WHERE ROLL_NO = ?");

		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());

		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i + "Updated");

		ps.close();
		conn.close();
	}

	public void delete(StudentBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM STUDENT WHERE ROLL_NO = ?");
		ps.setString(1, bean.getRollNo());

		int i = ps.executeUpdate();

		conn.commit();
		System.out.println(i);

		ps.close();
		conn.close();

	}

	public List<StudentBean> search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("SELECT ID, ROLL_NO,FIRST_NAME, LAST_NAME, SESSION FROM STUDENT");
		ResultSet rs = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();

		while (rs.next()) {

			StudentBean bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			bean.setSession(rs.getString(5));
			list.add(bean);
		}

		conn.commit();
		ps.close();
		conn.close();
		return list;

	}

	public List<StudentBean> get(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection conn = DriverManager.getConnection("jDbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT WHERE ROLL_NO= ?");
		ps.setString(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();

		while (rs.next()) {

			StudentBean bean1 = new StudentBean();
			bean1.setId(rs.getInt(1));
			bean1.setRollNo(rs.getString(2));
			bean1.setFirstName(rs.getString(3));
			bean1.setLastName(rs.getString(4));
			bean1.setSession(rs.getString(5));
			list.add(bean1);
		}

		conn.commit();
		ps.close();
		conn.close();
		return list;

	}
}
