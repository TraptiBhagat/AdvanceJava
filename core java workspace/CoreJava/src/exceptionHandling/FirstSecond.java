package exceptionHandling;

public class FirstSecond {
	public static void main(String[] args) {
		//first();
		try {
			first();
		} catch (Exception e2) {
			System.out.println("caught the final exception!");
		}

	}

	public static void first() {
		try {
			second();
		} catch (RuntimeException e) {
			System.out.println("Caught by dad, raised by son");
			RuntimeException e2 = new RuntimeException();
			throw e2;
		}
	}

	public static void second() {
		RuntimeException e = new RuntimeException();
		throw e;
	}
}
