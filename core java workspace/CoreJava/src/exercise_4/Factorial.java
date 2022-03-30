package exercise_4;

public class Factorial {
public static void main(String[] args) {
	int factorial = 1;
	for(int i=1;i<=4;i++) {
		System.out.println(i);
		factorial = factorial * i;
	 }
	System.out.println(factorial);
  }
}
