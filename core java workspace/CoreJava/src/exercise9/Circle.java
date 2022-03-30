package exercise9;

public class Circle extends Shape{
	private double radius;
	private double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return (PI * radius * radius);
	}
}
