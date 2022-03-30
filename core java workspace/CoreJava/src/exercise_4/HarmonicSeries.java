package exercise_4;

public class HarmonicSeries {
   public static void main(String[]args) {
	  double num = 5;
	   double result = 0; 
	  while (num>0) {
		result=result+(1/num);
		System.out.println(result);
		num--;
	}
   }
}
