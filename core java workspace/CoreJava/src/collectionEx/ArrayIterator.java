package collectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if (!o.equals("two")) {
				it.remove();
				System.out.println(o);
			}
			
		}
	}

}
