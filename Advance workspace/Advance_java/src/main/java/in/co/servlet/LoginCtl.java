package in.co.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.bean.AuthenticateBean;
import in.co.model.AuthenticateModel;

@WebServlet("/Loginctl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("id");
		String password = request.getParameter("pwd");

		AuthenticateModel model = new AuthenticateModel();
		try {
			AuthenticateBean bean = model.Authenticate(bean);

			if (login.equals("") && password.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("Welcome");
				request.setAttribute("i1", "Login is req...!!");
				request.setAttribute("i2", "Pass is req...!!");
				rd.forward(request, response);

			} else if (login.equals("") || password.equals("")) {

				if (login.equals("")) {

					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("i1", "Login is req...!!");
					rd.forward(request, response);

				} else {

					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("i2", "Pass is req...!!");
					rd.forward(request, response);

				}
			}

			else {

				if (bean != null) {

					RequestDispatcher rd = request.getRequestDispatcher("WelcomeView.jsp");
					request.setAttribute("user", bean.getId());
					rd.forward(request, response);

				} else {

					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("err", "Invalid User...!!");
					rd.forward(request, response);

				}

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}