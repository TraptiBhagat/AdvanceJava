package javabasics;

public class While {
   public static void main(String []args) {
	   boolean counter = true;
	   int i = 0;
	   while(counter) {
		   System.out.println("This is the while looping");
		   i++;
		   if(i>10)
			   counter = false;
	   }
   }
}
