package Constructor;

public class SuperReturn2 extends SuperReturn {
	public static void main(String[] args) {
		SuperReturn2 s = new SuperReturn2();
		int i = s.add();
		System.out.println(i);
	}

	public int add() {
		System.out.println("Child Add");
		return super.add() + 10;
	}

}
