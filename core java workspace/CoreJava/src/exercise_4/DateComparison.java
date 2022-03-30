package exercise_4;

import java.text.ParseException;

public class DateComparison {
	public static void main(String[] args) throws ParseException {
		 
		  String startDate = args[0];
		  String endDate = args[1];
		  
		 
		
		
		if(startDate.compareTo (endDate) == -1) {
			System.out.println(endDate);
		}else {
			System.out.println("ERROR!");
		}
		
		
		  
		}
	}

