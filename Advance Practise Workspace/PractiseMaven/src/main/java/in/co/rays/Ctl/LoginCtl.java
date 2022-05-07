package in.co.rays.Ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.CandidateBean;
import in.co.rays.model.CandidateModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");

		CandidateModel model = new CandidateModel();
		HttpSession session = req.getSession();
		try {
			CandidateBean bean = model.authenticate(fname, lname);
			if (fname.equals("") && lname.equals("")) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("CredReq1", "Firstname is required");
				req.setAttribute("CredReq2", "Lastname is required");
				rd.forward(req, resp);
			} else if (fname.equals("") || lname.equals("")) {

				if (fname.equals("")) {
					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("CredReq1", "Firstname is required");
					rd.forward(req, resp);
				} else {
					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("CredReq2", "Lastname is required");
					rd.forward(req, resp);
				}
			} else {

				if (bean != null) {

					RequestDispatcher rd = req.getRequestDispatcher("WelcomeCtl.do");
					session.setAttribute("user", bean);
					// req.setAttribute("user", bean.getFirstName());
					rd.forward(req, resp);
				} else {
					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					req.setAttribute("error", "Invalid Firstname and Lastname");
					rd.forward(req, resp);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
