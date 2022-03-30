package javabasics;

public class Array2D {
	public static void main(String[] args) {
		int [][] a = new int [9][10];
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("");
			for(int j = 2; j<a[i].length; j++) {
				int x = i + 1;
				//System.out.println();
				int val = x*j;
				
				System.out.print(val + "\t");
			}
		}
	}

}
