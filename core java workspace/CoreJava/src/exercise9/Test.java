package exercise9;

public class Test {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(2);
		// c.getRadius();

		Triangle t = new Triangle();
		t.setBase(2.0);
		// System.out.println(t.getBase());
		t.setHeight(4.0);
		// System.out.println(t.getHeight());

		Rectangle r = new Rectangle();
		r.setBreadth(4.0);
		// r.getBreadth();
		r.setLength(4.0);
		// r.getLength();
		Shape[] s = new Shape[3];
		s[0] = c;
		s[1] = r;
		s[2] = t;

		double area = calcArea(s);
		System.out.println(area);
	}

	public static double calcArea(Shape[] s) {
		double area = 0;

		for (int i = 0; i < s.length; i++) {

			area += s[i].area();
		}
		return area;
	}

}
