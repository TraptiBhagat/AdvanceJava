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

@WebServlet("/GetCandidateCtl")
public class GetCandidateCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CandidateBean bean = new CandidateBean();
		bean.setId((Integer.parseInt(req.getParameter("id"))));
		CandidateModel model = new CandidateModel();
		List<CandidateBean> list;
		try {
			list = model.Get(bean);
			RequestDispatcher rd = req.getRequestDispatcher("GetCandidateDetails.jsp");
			req.setAttribute("List", list);
			rd.forward(req, resp);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
