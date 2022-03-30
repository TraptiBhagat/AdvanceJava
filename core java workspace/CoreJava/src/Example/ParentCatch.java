package Example;

public class ParentCatch {
	public static void main(String[] args) {
		String name = args[0];
		try {
			System.out.println("Length of name is  " + name.length());
			System.out.println("Character at 5th position " + name.charAt(5));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai!!");
		} catch (RuntimeException e) {
			System.out.println("Sundar sa nam nahi hai!!");
		} finally {
			System.out.println("Kshatriya hu mai!!");
		}
	}
}
