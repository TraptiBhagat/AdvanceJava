package com.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class MarksheetModal {
	   public void add(MarksheetBean bean) throws Exception {

           Class.forName("com.mysql.jdbc.Driver");

           Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
                           "root");

           conn.setAutoCommit(false);

           PreparedStatement ps = (PreparedStatement) conn.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?,?)");

           ps.setInt(1, nextPk());
           ps.setInt(2, bean.getRollno());
           ps.setString(3, bean.getFname());
           ps.setString(4, bean.getLname());
           ps.setInt(5, bean.getPhysics());
           ps.setInt(6, bean.getChemistry());
           ps.setInt(7, bean.getMaths());
          

           int i = ps.executeUpdate();

           conn.commit();
           System.out.println(i + "Inserted");

           ps.close();
           conn.close();

   }
	   
	   public Integer nextPk() throws Exception {

           Class.forName("com.mysql.jdbc.Driver");

           Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
                           "root");

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


}

