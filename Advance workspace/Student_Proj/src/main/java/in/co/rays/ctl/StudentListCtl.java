package in.co.rays.ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

@WebServlet("/StdList")
public class StudentListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = model.search();

			RequestDispatcher rd = req.getRequestDispatcher("StudentListView.jsp");
			req.setAttribute("List", list);
			rd.forward(req, resp);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
