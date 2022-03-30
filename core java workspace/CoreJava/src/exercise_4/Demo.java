package exercise_4;

public class Demo {
	public static int main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int x = 4;

		for (int i = 0; i < a.length; i++) {
			int y = a[i];
			if (x == y) {
				// int position = a[i];
				System.out.println(a[i]);
			}

		}
		System.out.println("hello");
		return -1;
	}

}
