public class DoWhileRectangle {

  public int height = 3;
  public int width = 10;

  public void displayRectangle() {
    
    int rowCount = 0;
    int colCount = 0;

    do {
      colCount = 0;
      
      do {
	      System.out.print("@");
	      colCount++;
      }
      while (colCount < width);

      System.out.println();
      rowCount++;
    }
    while (rowCount < height);
  }
}
