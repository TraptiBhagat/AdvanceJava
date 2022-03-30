package oop;

public class CircleOverriding extends MethodOverriding {
	private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void area() {
	 System.out.println("area"+(3.14*radius*radius));
	}
}
