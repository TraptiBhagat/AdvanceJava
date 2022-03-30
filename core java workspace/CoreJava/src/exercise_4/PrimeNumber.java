package exercise_4;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 17;
		if (num > 0 && num > 1) {
			for (int i = 2; i <= num; i++) {

				if (num % i == 0) {
					if (num /i == 1) {
						System.out.println("Given number is prime!");
					} else {
						System.out.println("Given number is not prime!");
						break;
					}
				}
			}
		}
	}
}