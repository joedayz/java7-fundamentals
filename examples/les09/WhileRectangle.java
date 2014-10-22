public class WhileRectangle {

  public int height = 3;
  public int width = 10;

  public void displayRectangle() {

    int colCount = 0;
    int rowCount = 0;
    
    while (rowCount < height) {
      colCount=0;
      
      while (colCount < width) {
	      System.out.print("@");
	      colCount++;
      }
      
      System.out.println();
      rowCount++;
    }
  }
}
