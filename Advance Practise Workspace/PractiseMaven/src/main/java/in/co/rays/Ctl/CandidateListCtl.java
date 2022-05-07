package in.co.rays.Ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.CandidateBean;
import in.co.rays.model.CandidateModel;

@WebServlet(urlPatterns = "/CandidateListCtl.do")
public class CandidateListCtl extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CandidateModel model = new CandidateModel();
		try {
			List<CandidateBean> list = model.search();

			RequestDispatcher rd = req.getRequestDispatcher("CandidateListView.jsp");
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
