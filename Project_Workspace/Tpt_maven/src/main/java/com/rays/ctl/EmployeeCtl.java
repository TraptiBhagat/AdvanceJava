package com.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.rays.bean.EmployeeBean;
import com.rays.model.EmployeeModel;

@WebServlet(urlPatterns = "/trapti")

public class EmployeeCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setSalary(Integer.parseInt(req.getParameter("salary")));

		EmployeeModel model = new EmployeeModel();
		try {
			model.add(bean);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("Data Successfully Inserted");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
