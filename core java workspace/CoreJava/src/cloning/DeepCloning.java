package cloning;

public class DeepCloning implements Cloneable {
	public String name = null;
	public ShallowCloning account = null;

	public DeepCloning(String name) {
		this.name = name;
		account = new ShallowCloning(10);
	}

	protected Object clone() throws CloneNotSupportedException {
		DeepCloning d = (DeepCloning) super.clone();
		d.account = (ShallowCloning) account.clone();
		return d;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloning d1 = new DeepCloning("Trapti");
		DeepCloning d2 = (DeepCloning) d1.clone();

		/*
		 * d2.name = "Bhagat"; d2.account.balance = 20;
		 */
		System.out.println("Original data");
		System.out.println("balance : " + d1.account.balance);
		System.out.println("name : " + d1.name);

		System.out.println("Cloned data");
		System.out.println("balance : " + d2.account.balance);
		System.out.println("name : " + d2.name);
	}

}
