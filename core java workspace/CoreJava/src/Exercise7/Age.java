package Exercise7;

import java.util.Calendar;

public class Age {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		int DOBDate = 8;
		int DOBMon = 9;
		//int DOBMon= cal.get(Calendar.SEPTEMBER);
		int DOByear = 1999;
		
		int AgeY = year - DOByear;
		System.out.println(AgeY);
		int AgeM = month - DOBMon;
		System.out.println(AgeM);
		int AgeD = date - DOBDate;
		System.out.println(AgeD);
		
		}
		
	}


