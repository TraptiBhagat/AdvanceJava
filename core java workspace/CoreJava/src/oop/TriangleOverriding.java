package oop;

public class TriangleOverriding {
	private int base;
	private int height;
    public double d1 = 1 / 2 * base * height; 
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void area() {
		System.out.println(d1); 
	}
}
