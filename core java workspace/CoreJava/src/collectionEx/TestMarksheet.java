package collectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		Marksheet m1 = new Marksheet();
		l.add(m1);
		Marksheet m2 = new Marksheet();
		l.add(m2);

		m1.setRollNo("A01");
		m1.setName("Trapti Bhagat");
		m1.setPhysics(80);
		m1.setChemistry(80);
		m1.setMath(80);

		System.out.print(" " + m1.getRollNo());
		System.out.print(" " + m1.getName());
		System.out.print(" " + m1.getPhysics());
		System.out.print(" " + m1.getChemistry());
		System.out.println(" " + m1.getMath());

		m2.setRollNo("A02");
		m2.setName("Veena Yadav");
		m2.setPhysics(90);
		m2.setChemistry(90);
		m2.setMath(90);

		System.out.print(" " + m2.getRollNo());
		System.out.print(" " + m2.getName());
		System.out.print(" " + m2.getPhysics());
		System.out.print(" " + m2.getChemistry());
		System.out.println(" " + m2.getMath());
		
		Collections.sort(l);
		System.out.println(l);
		
       
	}

}
