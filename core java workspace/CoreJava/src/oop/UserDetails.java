package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDetails {
	public static void main(String[] args) throws ParseException {
		
		//Date d = new Date();
				String s = "08/09/1999";
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date d = sdf.parse(s);
		
		Person p = new Person("Trapti Bhagat", d , "155, Nyay Nagar");
		Account a = new Account();
		Automobile x = new Automobile();
		
		
		
		

		//p.setName("Trapti Bhagat");
		//p.setDob(d);
		//p.setAddress("155, Nyay Nagar");

		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());

		a.setAccountType("Saving");
		a.setNumber("BOI1234567");
		a.setBalance(25000);

		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());

		x.setColor("Black");
		x.setMake("Germany");
		x.setSpeed(420);

		System.out.println(x.getColor());
		System.out.println(x.getMake());
		System.out.println(x.getSpeed());

	}
}
