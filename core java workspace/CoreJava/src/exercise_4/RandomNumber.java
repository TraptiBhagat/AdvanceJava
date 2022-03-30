package exercise_4;

public class RandomNumber {
   public static void main(String[] args) {
	   
	   
	   for (int i = 0; i <5; i++) {
		System.out.println((int)(Math.random()*100));
	}
	   
	   
		/*
		 * for(int i = 0; i<5; i++) { int maxRange = 100; int minRange = 1; int range =
		 * (maxRange - minRange) + 1; System.out.println((Math.random() * range) +
		 * minRange); }
		 */
   }
}
