package com.mysql;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetModal {
	public static void main(String[] args) throws Exception {
		// testUp();
		// testGet(5);
		// testGetMerit();
		// testSearch();
		testDel();
		// testAdd();
		// testNextPk();
	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRollno(7);
		bean.setFname("AMRUTA");
		bean.setLname("DAWLE");
		bean.setPhysics(88);
		bean.setChemistry(90);
		bean.setMaths(90);
		// bean.setId(11);
		MarksheetModal model = new MarksheetModal();
		model.add(bean);

	}

	private static void testNextPk() throws Exception {

		MarksheetModalMer model = new MarksheetModalMer();

	}

	private static void testDel() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(6);

		MarksheetModalDel model = new MarksheetModalDel();
		model.del(bean);

	}

	private static void testSearch() throws Exception {
		MarksheetModalSearch m = new MarksheetModalSearch();
		List list = m.search();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			MarksheetBean b = (MarksheetBean) it.next();

			System.out.print("\t" + b.getId());
			System.out.print("\t" + b.getRollno());
			System.out.print("\t" + b.getFname());
			System.out.print("\t" + b.getLname());
			System.out.print("\t" + b.getPhysics());
			System.out.print("\t" + b.getChemistry());
			System.out.println("\t" + b.getMaths());

		}
		if (list != null) {
			System.out.println("HEYYY!");
		}

	}

	private static void testUp() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setRollno(6);
		bean.setFname("AMRUTA");
		bean.setLname("DAWLE");
		bean.setPhysics(88);
		bean.setChemistry(90);
		bean.setMaths(90);
		bean.setId(6);

		MraksheetModalUp modal = new MraksheetModalUp();
		modal.update(bean);

	}

	/*
	 * private static void testGet(int i) throws Exception {
	 * 
	 * MarksheetBean bean1 = new MarksheetBean(); bean1.setRollno(i);
	 * 
	 * MarksheetModalMer md = new MarksheetModalMer(); md.getRoll(bean1);
	 * 
	 * }
	 */
	private static void testGetMerit() throws Exception {

		MarksheetModalSearch m = new MarksheetModalSearch();
		List list = m.search();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			MarksheetBean b = (MarksheetBean) it.next();

			System.out.print("\t" + b.getId());
			System.out.print("\t" + b.getRollno());
			System.out.print("\t" + b.getFname());
			System.out.print("\t" + b.getLname());
			System.out.print("\t" + b.getPhysics());
			System.out.print("\t" + b.getChemistry());
			System.out.println("\t" + b.getMaths());

		}
	}
}
