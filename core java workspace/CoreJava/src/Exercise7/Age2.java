package Exercise7;

import java.time.LocalDate;
import java.time.Period;

public class Age2 {
	
	public static void main(String[] args) {
		
		LocalDate l =  LocalDate.of(1999, 9, 8);
		LocalDate l1 = LocalDate.now();
		Period p = Period.between(l, l1);
	System.out.println(p);
	/*for(int i=1; i<=12 ; i++) {
	System.out.println(l1.plusDays(30));
	
	}*/
	
System.out.println("years = "+p.getYears());
System.out.println("months ="+p.getMonths());
System.out.println("days ="+p.getDays());
		
	}

}
