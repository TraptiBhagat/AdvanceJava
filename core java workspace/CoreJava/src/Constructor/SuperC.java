package Constructor;

public class SuperC extends SuperP {
	public static void main(String[] args) {
		SuperC s = new SuperC(12, 13);

	}

	public SuperC(int i, int j) {
		super(j);
		System.out.println("Hello " + i);
	}
}
