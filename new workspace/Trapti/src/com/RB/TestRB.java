package com.RB;

import java.util.ResourceBundle;

public class TestRB {
  public static void main(String[] args) {
	ResourceBundle rb = ResourceBundle.getBundle("com.RB.app");
	String Driver =  rb.getString("Driver");
	System.out.println(Driver);
	String url =  rb.getString("url");
	System.out.println(url);
	String username =  rb.getString("username");
	System.out.println(username);
	String password =  rb.getString("password");
	System.out.println(password);
	
}
}
