package com.RB;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
public static void main(String[] args) {
	ResourceBundle rb = ResourceBundle.getBundle("com.RB.app",new Locale("hi"));
	System.out.println(rb.getString("greeting"));
}
}
