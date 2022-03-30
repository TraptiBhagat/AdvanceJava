package exercise_4;

public class PositionOfInt {
	static boolean z;

	public static void main(String[] args) {
		int a = position();
		if (z) {
			System.out.println(a);
		}
	}

	public static int position() {
		int[] a = { 5, 4, 3, 2, 1 };
		int x = 3;

		for (int i = 0; i < a.length; i++) {

			int y = a[i];
			if (x == y) {
				// int position = a[i];
				System.out.println(i);
			} else {
				z = x != y;
			}

		}
		return -1;
	}
}
