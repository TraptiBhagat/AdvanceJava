package exercise_4;

public class LargeNumArray {
	public static void main(String[] args) {

		int[] numArray = { 1, 4, 6, 9, 3, 8 };
		int x = 0;
		for (int i = 0; i < numArray.length; i++) {

			if (x < numArray[i]) {
				x = numArray[i];

			}
		}
		System.out.println(x + " is largest number of array.");
	}

}
