package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = "/LoginCtl")

public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String password = req.getParameter("pwd");
		Cookie c = new Cookie(login, password);
		c.setMaxAge(24 * 60 * 60);
		resp.addCookie(c);

		PrintWriter out = resp.getWriter();
		out.println("Cookie added");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String password = req.getParameter("pwd");

		UserModel model = new UserModel();
		try {

			HttpSession session = req.getSession();
			UserBean bean = model.authenticate(login, password);

			if (login.equals("") && password.equals("")) {

				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("i1", "Login is req...!!");
				req.setAttribute("i2", "Pass is req...!!");
				rd.forward(req, resp);

			} else if (login.equals("") || password.equals("")) {

				if (login.equals("")) {

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("i1", "Login is req...!!");
					rd.forward(req, resp);

				} else {

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("i2", "Pass is req...!!");
					rd.forward(req, resp);

				}
			}

			else {

				if (bean != null) {
					session.setAttribute("user", bean);
					RequestDispatcher rd = req.getRequestDispatcher("Welcome.do");
					// req.setAttribute("user", bean.getName());
					rd.forward(req, resp);
					Cookie c = new Cookie(login, password);
					c.setMaxAge(24 * 60 * 60);
					resp.addCookie(c);

					/*
					 * PrintWriter out = resp.getWriter(); out.println("Cookie added");
					 */

				} else {

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("err", "Invalid User...!!");
					rd.forward(req, resp);

				}

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
