package collectionEx;

public class CompareMarksheet implements Comparable<CompareMarksheet> {
	public String rollNo;
	public String name;
	public int marks;

	public CompareMarksheet(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

	public int compareTo(CompareMarksheet n) {

		return name.compareTo(n.name);
	}

	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}
