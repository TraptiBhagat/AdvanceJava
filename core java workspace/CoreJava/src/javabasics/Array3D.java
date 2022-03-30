package javabasics;

public class Array3D {
	public static void main(String[] args) {
		int[][][] a = new int[3][3][3];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(" ");
				for (int k = 0; k < a[j].length; k++) {
					System.out.print(k + "\t");
				}
			}

		}
	}
}
