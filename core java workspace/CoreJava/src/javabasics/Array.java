package javabasics;

public class Array {
  public static void main(String[] args) {
	  int Array[] = new int [5];
	  Array[0] = 1;
	  Array[1] = 2;
	  Array[2] = 3;
	  Array[3] = 4;
	  Array[4] = 5;
	  
	  for(int i = 0; i<Array.length; i++) {
		System.out.println(Array[i]);  
	  }
  }
}
