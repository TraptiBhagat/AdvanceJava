package in.co.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.bean.RegistrationBean;
import in.co.model.RegistrationModel;

@WebServlet("/RegistrationCtl")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationBean bean = new RegistrationBean();
		bean.setId(request.getParameter("id"));
		bean.setFname(request.getParameter("firstname"));
		bean.setLname(request.getParameter("lastname"));
		bean.setPhone(request.getParameter("phone"));
		bean.setEmail(request.getParameter("email"));
		bean.setPassword(request.getParameter("password"));

		RegistrationModel model = new RegistrationModel();

		try {
			model.add(bean);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Data Successfully Inserted");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

