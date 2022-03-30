package oop;

public class RectangleEx extends ShapeInheritance {
	private double length = 0;
	private double width = 0;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return length * width;
	}
}
