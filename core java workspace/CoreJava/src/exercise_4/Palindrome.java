package exercise_4;

public class Palindrome {
	public static void main(String[] args) {
		int num = 4554, reverseNum = 0, remainder;

		int x = num;

		while (num != 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}

		if (x == reverseNum) {
			System.out.println(x + " is Palindrome.");
		} else {
			System.out.println(x + " is not Palindrome.");
		}
	}

}
