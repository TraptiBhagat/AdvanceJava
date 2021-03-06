package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

public class TestStudentModel {

	public static void main(String[] args) throws Exception {
		String i = null;
		// testAdd();
		// testUp();
		// testDel();
		// testSearch();
		testGet(i);
	}

	private static void testGet(String i) throws Exception {

		StudentBean bean1 = new StudentBean();
		bean1.setRollNo("101");

		StudentModel md = new StudentModel();
		md.get(bean1);

	}

	private static void testSearch() throws Exception {
		StudentModel m = new StudentModel();
		List list = m.search();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			StudentBean b = (StudentBean) it.next();

			System.out.print("\t" + b.getId());
			System.out.print("\t" + b.getRollNo());
			System.out.print("\t" + b.getFirstName());
			System.out.print("\t" + b.getLastName());
			System.out.println("\t" + b.getSession());

		}

	}

	
	
	private static void testAdd() throws Exception {
		StudentBean bean = new StudentBean();
		// bean.setId(id);
		bean.setRollNo("104");
		bean.setFirstName("Sanket");
		bean.setLastName("Jain");
		bean.setSession("2020-21");

		StudentModel model = new StudentModel();
		model.add(bean);
	}

	private static void testUp() throws Exception {
		StudentBean bean = new StudentBean();

		bean.setRollNo("104");
		bean.setFirstName("Veena");
		bean.setLastName("Yadav");
		bean.setSession("2020-21");
		bean.setId(5);

		StudentModel model = new StudentModel();
		model.update(bean);

	}

	private static void testDel() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setId(5);

		StudentModel model = new StudentModel();
		model.delete(bean);

	}

}
