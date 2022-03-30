package exceptionHandling;

public class FamilyPropagation {
	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Caught by dad, raised by son");
		}
	}

	public static void mom() {
		son();
	}

	public static void son() {
		RuntimeException e = new RuntimeException();
		throw e;
	}
}
