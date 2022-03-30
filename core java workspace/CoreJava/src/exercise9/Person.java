package exercise9;

public class Person {
	String fname;
	String lname;

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
	

	
	public String toString() {
		
		return fname+" "+lname;
	}

}