package exercise_4;

public class MissingElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6};
		int[] b = { 1, 2, 3, 4, 5 };
		int x = 0;
		int y = 0;
		for (int i = 0; i <a.length; i++) {
			x = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			y = b[j];
		}
		if (x != y) {
			System.out.println(x);
		}

	}
}
