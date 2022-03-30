package in.co.bean;

public class RegistrationBean {
	private String Id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String password;

	public String getId() {
		return Id;
	}

	public void setId(String string) {
		Id = string;
	}

	public String getFname() {
		return firstname;
	}

	public void setFname(String fname) {
		this.firstname = fname;
	}

	public String getLname() {
		return lastname;
	}

	public void setLname(String lname) {
		this.lastname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
