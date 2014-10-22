/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class RectangleTest {
  public static void main(String args[]){
	// Rectangle with default values (no args)
      Rectangle r1 = new Rectangle();
      r1.draw();
      // Rectangle from args constructor
      Rectangle r2 = new Rectangle(15,5);
      System.out.println("Area of r2 is: " + r2.getArea());
      r2.draw();
  }// end main
} // end class
