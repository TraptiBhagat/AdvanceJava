package oop;

public class Shape {
   private String color = null;
   private int borderWidth = 0;
   public static final double PI = 3.14;
   
   public Shape( String color, int borderWidth) {
	   this.color = color;
	   this.borderWidth = borderWidth;
   }
   
   public String getcolor() {
	   return color;
   }
   
  /* public  Shape( int borderWidth) {
	   this.borderWidth = borderWidth;
   }*/
   
   public int getborderWidth() {
	   return borderWidth;
   }
}
