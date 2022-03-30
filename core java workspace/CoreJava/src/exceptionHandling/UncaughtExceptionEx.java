package exceptionHandling;

public class UncaughtExceptionEx {
	public static void main(String[] args) {
		int k = 0;
		int i = 12;

		try {
			double d = i / k;
			System.out.println(d);
		} catch (Exception e) {
			System.out.println("HERE'S THE EXCEPTION!!  " + e.getMessage());
		    e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

	}
}
