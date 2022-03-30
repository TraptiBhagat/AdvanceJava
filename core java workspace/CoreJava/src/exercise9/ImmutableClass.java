package exercise9;

public final class ImmutableClass {
	private final String fname;
	private final String lname;

	public ImmutableClass(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
}
