public class ForRectangle {

  public int height = 3;
  public int width = 10;
  
  public void displayRectangle() {
    
    for (int rowCount = 0; rowCount < height; rowCount++) {
      for (int colCount = 0; colCount < width; colCount++) {
	      System.out.print("@");
      }
      System.out.println();
    }
  }
}
