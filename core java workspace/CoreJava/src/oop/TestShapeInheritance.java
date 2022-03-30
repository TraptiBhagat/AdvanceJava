package oop;

public class TestShapeInheritance {
	public static void main(String[] args) {

		CircleEx c = new CircleEx();
		TriangleEx t = new TriangleEx();
		RectangleEx r = new RectangleEx();

		// ShapeInheritance s = new CircleEx();
		// CircleEx c = (CircleEx) s;

		c.setBw(20);
		c.setColor("Blue");
		c.setRadius(2);
		double d = c.area();

		System.out.println(c.getBw());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(d);

		r.setLength(12);
		r.setWidth(10);
		double d1 = r.area();

		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(d1);

		t.setBase(6);
		t.setHeight(2);
		double d2 = t.area();

		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(d2);
	}
}
