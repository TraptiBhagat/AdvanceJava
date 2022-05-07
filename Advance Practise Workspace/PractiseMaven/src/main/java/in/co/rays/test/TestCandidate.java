package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.CandidateBean;
import in.co.rays.model.CandidateModel;

public class TestCandidate {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		// testDelete();
		testGet();
		//testSearch();
	}

	private static void testSearch() throws Exception {
		CandidateModel model = new CandidateModel();
		List list = model.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			CandidateBean bean = (CandidateBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollno());
			System.out.print("\t" + bean.getFirstName());
			System.out.println("\t" + bean.getLastName());

		}

	}

	private static void testGet() throws Exception {
		CandidateBean bean = new CandidateBean();
		bean.setId(1);
		CandidateModel model = new CandidateModel();
		List list = model.Get(bean);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			CandidateBean bean1 = (CandidateBean) it.next();

			System.out.print(bean1.getId());
			System.out.print("\t" + bean1.getRollno());
			System.out.print("\t" + bean1.getFirstName());
			System.out.println("\t" + bean1.getLastName());

		}

	}

	private static void testDelete() throws Exception {
		CandidateBean bean = new CandidateBean();
		bean.setRollno("107");

		CandidateModel model = new CandidateModel();
		model.delete(bean);

	}

	private static void testUpdate() throws Exception {
		CandidateBean bean = new CandidateBean();

		bean.setRollno("108");
		bean.setFirstName("abc");
		bean.setLastName("xyz");
		bean.setId(7);

		CandidateModel model = new CandidateModel();
		model.update(bean);

	}

	private static void testAdd() throws Exception {
		CandidateBean bean = new CandidateBean();
		// bean.setId();
		bean.setRollno("107");
		bean.setFirstName("Bhagyashri");
		bean.setLastName("Saxena");
		CandidateModel model = new CandidateModel();
		model.add(bean);

	}
}
