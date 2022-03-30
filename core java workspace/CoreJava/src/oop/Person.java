package oop;

import java.util.Date;

public class Person {
	private String name = null;
	private Date dob = null;
	private String address = null;

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public Person(String name, Date dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setDob(Date dob) { this.dob = dob;
	 * 
	 * }
	 */

	public Date getDob() {
		return dob;
	}

	/*
	 * public void setAddress(String address) { this.address = address; }
	 */

	public String getAddress() {
		return address;
	}
}
