package com.mysql;

public class MarksheetBean {
  private int id;
  private int Rollno;
  private String fname;
  private String lname;
  private int physics;
  private int chemistry;
  private int maths;
  
  public MarksheetBean() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getRollno() {
	return Rollno;
}

public void setRollno(int rollno) {
	Rollno = rollno;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public int getPhysics() {
	return physics;
}

public void setPhysics(int physics) {
	this.physics = physics;
}

public int getChemistry() {
	return chemistry;
}

public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}

public int getMaths() {
	return maths;
}

public void setMaths(int maths) {
	this.maths = maths;
}
 @Override
	public String toString() {
		
		return fname;
	} 
  
}
