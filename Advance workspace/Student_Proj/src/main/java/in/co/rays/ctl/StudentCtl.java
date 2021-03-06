package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

@WebServlet("/student")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean bean = new StudentBean();

		bean.setRollNo(request.getParameter("rollNo"));
		bean.setFirstName(request.getParameter("firstName"));
		bean.setLastName(request.getParameter("lastName"));
		bean.setSession(request.getParameter("session"));

		StudentModel model = new StudentModel();

		String op = request.getParameter("operation");

		if (op.equals("Add")) {
			try {
				model.add(bean);
				RequestDispatcher rd = request.getRequestDispatcher("StudentView.jsp");
				request.setAttribute("add", "Data added successfully");
				rd.forward(request, response);
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else if (op.equals("Delete")) {
			try {
				model.delete(bean);
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else if (op.equals("Modify")) {
			try {
				model.update(bean);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
