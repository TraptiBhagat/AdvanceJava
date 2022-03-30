package Constructor;

public class SuperM2 extends SuperM {
	public static void main(String[] args) {
		SuperM2 s = new SuperM2();
		s.add(2);
	}

	public void add(int i) {
		super.add(i);
		System.out.println("Child Method");
		//System.out.println(i);
		//System.out.println(j);
	}

}
