package collectionEx;

import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Bura mat Dekho");
		a.add("yellow");
		a.add("pink");

		ArrayList b = new ArrayList();
		b.add("pink");
		b.add("yellow");
		b.add("blue");

		//b.addAll(a);

		// System.out.println(a);
		 
		// System.out.println();
		// System.out.println(b.contains("pink"));
		// System.out.println(b.contains("pink"));
		// System.out.println(b.isEmpty());
		
		//a.remove(0);
		//System.out.println(a);
		//b.removeAll(a);
		System.out.println(b);
		b.retainAll(a);
		System.out.println(b);
		
	}

}
