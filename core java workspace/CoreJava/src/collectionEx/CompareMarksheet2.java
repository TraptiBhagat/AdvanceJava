package collectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class CompareMarksheet2 {
	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();
		marksheets.add(new CompareMarksheet("A4", "Sakshi S", 89));
		marksheets.add(new CompareMarksheet("A2", "P Sindhu", 90));
		marksheets.add(new CompareMarksheet("A3", "Saina N", 80));

		Collections.sort(marksheets);
		for (Object o : marksheets) {
			System.out.println(o);
		}

	}
}
