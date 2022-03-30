package exercise_4;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153, remainder, result = 0;

		int originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			//result += Math.pow(remainder, 3);
			result = result + (remainder*remainder*remainder);
			originalNumber /= 10;
		}

		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}
}
