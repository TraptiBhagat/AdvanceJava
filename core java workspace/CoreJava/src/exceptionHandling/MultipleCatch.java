package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		// String name = "Trapti";
		// String name = null;
		int [] name = { 0, 1, 2 };
		try {
			
			System.out.println("Length of name is  "+name[6] );
			System.out.println("Character at 7th position is "  );
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai!!");
		} catch (NullPointerException e) {
			System.out.println("Sundar sa nam nahi hai!!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index is bigger than string " );
		} finally {
			System.out.println("finally");
		}
	}
}
