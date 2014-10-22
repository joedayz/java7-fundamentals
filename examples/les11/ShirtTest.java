

public class ShirtTest {
   
  public static void main (String args[]) {
	  Shirt privShirt = new Shirt();
	  char colorCode;

	  // Set a valid colorCode
	  privShirt.setColorCode('R');
	  colorCode = privShirt.getColorCode();
	  
	  // The ShirtTest class can set a valid colorCode
	  System.out.println("Color Code: " + colorCode);
	  
	  // Set an invalid color code
	  privShirt.setColorCode('Z');
	  colorCode = privShirt.getColorCode();
	  
	  // The ShirtTest class cannot set an invalid colorCode.
	  // Color code is still R
	  System.out.println("Color Code: " + colorCode);
  } 
}