package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = "/forget")

public class ForgetPasswordCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");

		UserModel model = new UserModel();
		try {
			UserBean bean = model.forgetPassword(login);

			if (login.equals("")) {

				RequestDispatcher rd = req.getRequestDispatcher("ForgetPasswordView.jsp");
				req.setAttribute("t1", "Login is req...!!");
				rd.forward(req, resp);

			} else {

				if (bean != null) {

					RequestDispatcher rd = req.getRequestDispatcher("Password.jsp");
					req.setAttribute("t2", bean.getPassword());
					rd.forward(req, resp);

				} else {

					RequestDispatcher rd = req.getRequestDispatcher("ForgetPasswordView.jsp");
					req.setAttribute("t3", "Invalid Login Details...!!");
					rd.forward(req, resp);

				}

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
