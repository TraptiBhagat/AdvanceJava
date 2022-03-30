package exercise_4;

public class AverageEvenOdd {
	public static void main(String[] args) {
		int evenNum = 0, oddNum = 0, countE = 0, countO = 0;
		float avgEven = 0, avgOdd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNum = evenNum + i;
				countE++;
			}
		}

		avgEven = evenNum / countE;
		System.out.println(avgEven);

		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				oddNum = oddNum + j;
				countO++;
			}
		}

		avgOdd = oddNum / countO;
		System.out.println(avgOdd);
	}
}
