package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = "/register")

public class UserRegisterCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserBean bean = new UserBean();

		String name = request.getParameter("name");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		bean.setName(name);
		bean.setLogin(login);
		bean.setPassword(password);

		UserModel model = new UserModel();

		try {

			if (name.equals("") && login.equals("") && password.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("RegistrationView.jsp");

				request.setAttribute("p1", "Name is req...!!");
				request.setAttribute("p2", "Login is req...!!");
				request.setAttribute("p3", "Pass is req...!!");
				rd.forward(request, response);

			} else if (name.equals("") || login.equals("") || password.equals("")) {

				if (name.equals("")) {

					request.setAttribute("p1", "Name is req...!!");

				}
				if (login.equals("")) {

					request.setAttribute("p2", "Login is req...!!");

				}
				if (password.equals("")) {

					request.setAttribute("p3", "Pass is req...!!");

				}
				RequestDispatcher rd = request.getRequestDispatcher("RegistrationView.jsp");
				rd.forward(request, response);

			} else {

				model.add(bean);

				RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
				request.setAttribute("p", "Reg Successfully...!!");
				rd.forward(request, response);
			}

		}

		catch (

		Exception e) {

			e.printStackTrace();
		}

	}

}
