package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		testGet();

	}

	private static void testGet() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("100");

		StudentModel model = new StudentModel();
		List list = model.get(bean);

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

}
