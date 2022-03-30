package Calculator;

public class Calculator1 {
  public static void main(String[] args) throws Exception {
	 char ch = (char)System.in.read();
	 
	
	 
	 if(ch == 'A' || ch == 'a') {
		 Add(2, 5);
		 
	 }
	 else if(ch == 'S' || ch == 's'){
        Subtraction(8,2);
	 }
	 else if(ch == 'M' || ch == 'm') {
		 Multiply(2,2);
	 }
	 else if(ch == 'D' || ch == 'd') {
		 Divide(8,9);
	 }
	 else {
		 System.out.println("Incorrect Choice");
	 }
  }
  
  public static void Add(int a,int b) {
	  System.out.println("Addition is " + (a+b));
  }
  
  public static void Subtraction(int a, int b) {
	  if(a>b) {
		  System.out.println("Subtraction is " + (a-b) );
	  }else {
		  System.out.println("Subtraction is " + (b-a) );
	  }
	  
  }
  
  public static void Multiply(int a, int b) {
	  System.out.println("Multiplication is " + (a*b));
  }
  
  public static void Divide(int a, int b) {
	  if(a>b) {
		  System.out.println("Division is " + (a/b) );
	  }else {
		  System.out.println("Division is " + (b/a) );
	  }
  }
  
}
