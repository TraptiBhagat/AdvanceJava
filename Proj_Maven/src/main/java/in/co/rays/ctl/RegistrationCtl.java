package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/Register")
public class RegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserBean bean = new UserBean();
		bean.setId(Integer.parseInt(request.getParameter("id")));
		bean.setName(request.getParameter("firstUsename"));
		bean.setLogin((request.getParameter("login")));
		bean.setPassword(request.getParameter("password"));

		UserModel model = new UserModel();

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
