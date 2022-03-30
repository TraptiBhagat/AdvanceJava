package exceptionHandling;

public class LoginException extends Exception {
	public LoginException() {
		super("Invalid User!!");
	}
}
