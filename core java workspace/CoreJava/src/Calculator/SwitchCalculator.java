package Calculator;

public class SwitchCalculator {
   public static void main(String[] args) {
	 String size = args[0];
	 int a = Integer.parseInt(args[1]);
	 int b = Integer.parseInt(args[2]);
	 int c;
	 
	 switch(size) {
	 case "add":
		 c = a + b;
		 System.out.println("add = "+c);
		 break;
	 case "sub":
		 c = a - b;
		 System.out.println("sub = "+c);
		 break;
	 case "multi":
		 c = a * b;
		 System.out.println("mult = "+c);
		 break;
	 case "div":
		 c = a / b;
		 System.out.println("div = "+c);
		 break;
	 default:
		 System.out.println("Invalid Input");
	  }
   }
}
