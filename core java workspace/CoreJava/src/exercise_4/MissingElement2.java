package exercise_4;

public class MissingElement2 {
 public static void main(String[] args) {
	 
	 int[] a = {100,5,9,17,23,25,26};
	 int y = 0;
	 int x = 0;
	 int b[] = a;
	 for(int i = 0; i < a.length; i++) {
		 if(b[i]>x) {
			 y = x;
			 x = b[i];
		}else if(b[i] > y && b[i] > x) {
			y = b[i];
		}
	 }
	 System.out.println(y);
 }
}
