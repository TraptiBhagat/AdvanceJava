package in.co.rays.ctl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.ForwardRequest;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

@WebServlet("/GetStdCtl")
public class GetStdCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean bean = new StudentBean();
		bean.setRollNo(request.getParameter("rollno"));
		StudentModel model = new StudentModel();

		try {
			List<StudentBean> list = model.get(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetRollView.jsp");
			request.setAttribute("List", list);
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
