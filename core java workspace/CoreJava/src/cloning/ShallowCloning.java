package cloning;

public class ShallowCloning implements Cloneable {
	public double balance = 0;

	public ShallowCloning(double d) {
		balance = d;
	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning s1 = new ShallowCloning(10);
		ShallowCloning s2 = (ShallowCloning) s1.clone();
		//s2.balance = 20;
		System.out.println(s1.balance);
		System.out.println(s2.balance);

	}
}
