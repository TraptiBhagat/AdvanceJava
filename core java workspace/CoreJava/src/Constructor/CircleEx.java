package Constructor;

public class CircleEx extends Shape {
	public static void main(String[] args) {
		// CircleEx c = new CircleEx();
		// CircleEx c1 = new CircleEx(25, 18);
		// CircleEx c2 = new CircleEx(25, 18, 8);

		// Shape s = new CircleEx(18);
		Shape s1 = new Shape(12);
		Shape s2 = new Shape(12, 13);
	}

	/*
	 * public CircleEx() { System.out.println("HELLOOO!"); }
	 */

	public CircleEx(int i, int j) {
		System.out.println("HEYY!  " + i + " " + j);
	}

	public CircleEx(int i, int j, int k) {
		System.out.println("HEYY!  " + i + " " + j + " " + k);
	}
}
