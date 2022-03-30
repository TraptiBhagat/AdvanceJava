package interfaceEx;

public abstract class AbstractClass {
	String color = null;
	int borderWidth = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public abstract void add();

}
