package Example;

public class Test1 {
	public static void main(String[] args) {

		Shape1 s[] = new Shape1[3];
		s[0] = new Rectangle();
		s[1] = new Triangle();
		s[2] = new Circle();
		int totalArea = calcArea(s);
		System.out.println(totalArea);

	}
	
	public static int calcArea(Shape1[] s) {
		int totalArea = 0;
		
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}

}
