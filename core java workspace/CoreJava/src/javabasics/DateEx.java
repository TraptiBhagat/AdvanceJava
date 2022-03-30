
package javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
  public static void main(String[] args) throws ParseException {
	  Date d = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  String s = sdf.format(d);
	  System.out.println(s);
	  
	  String a = "08/09/1999";
      Date d1 = sdf.parse(a);
	  System.out.println(d1);
  }
}
