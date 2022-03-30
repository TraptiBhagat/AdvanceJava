package exceptionHandling;

public class LoginException2 {
	public static void main(String[] args) throws LoginException {
		LoginException2 l = new LoginException2();
		try {
			l.authentication("aaa");
		} finally {
			System.out.println("finally");
			/*
			 * } catch (LoginException e) { System.out.println("Access Denied!! " +
			 * e.getMessage()); }
			 */
		}
	}

	public void authentication(String name) throws LoginException {
		if (!"admin".contentEquals(name)) {
			LoginException e = new LoginException();
			throw e;
		}
	}
}