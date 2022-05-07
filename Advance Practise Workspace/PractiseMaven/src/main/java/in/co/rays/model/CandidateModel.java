package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import in.co.rays.bean.CandidateBean;

public class CandidateModel {
	public int nextPK() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT MAX(ID) FROM CANDIDATE");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;
	}

	public void add(CandidateBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps =  conn.prepareStatement("INSERT INTO CANDIDATE VALUES (?, ?, ?, ?)");
		ps.setInt(1, nextPK());
		ps.setString(2, bean.getRollno());
		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + "  Inserted");

		ps.close();
		conn.close();

	}

	public void update(CandidateBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps =  conn
				.prepareStatement("UPDATE CANDIDATE SET ROLL_NO = ?, FIRSTNAME = ?, LASTNAME= ? WHERE ID = ? ");
		ps.setString(1, bean.getRollno());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setInt(4, bean.getId());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + " Updated");
		ps.close();
		conn.close();

	}

	public void delete(CandidateBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM CANDIDATE WHERE ROLL_NO = ?");
		ps.setString(1, bean.getRollno());
		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + " Deleted");
		ps.close();
		conn.close();

	}

	public List<CandidateBean> Get(CandidateBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT  * FROM CANDIDATE WHERE ID = ?");
		ps.setInt(1, bean.getId());
		ResultSet rs = ps.executeQuery();
		ArrayList<CandidateBean> list = new ArrayList<CandidateBean>();
		while (rs.next()) {
			CandidateBean bean1 = new CandidateBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setFirstName(rs.getString(3));
			bean1.setLastName(rs.getString(4));
			list.add(bean1);
		}
		return list;
	}

	public List<CandidateBean> search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM CANDIDATE");
		ResultSet rs = ps.executeQuery();
		ArrayList<CandidateBean> list = new ArrayList<CandidateBean>();
		while (rs.next()) {
			CandidateBean bean = new CandidateBean();
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			list.add(bean);
		}
		conn.commit();
		ps.close();
		conn.close();
		return list;

	}

	public CandidateBean authenticate(String firstname, String lastname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("SELECT * FROM CANDIDATE WHERE FIRSTNAME = ? AND LASTNAME = ?");
		ps.setString(1, firstname);
		ps.setString(2, lastname);

		ResultSet rs = ps.executeQuery();
		CandidateBean bean = null;
		while (rs.next()) {
			bean = new CandidateBean();
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
		}

		return bean;

	}
}
