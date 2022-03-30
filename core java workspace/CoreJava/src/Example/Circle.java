package Example;

public class Circle extends Shape1 {

	private int radius = 11;
	private double PI = 3.14;

	public int area() {
		return (int) (PI * radius * radius);
	}

}
