

public class Shirt2Test {

  public static void main (String args[]) {

    Shirt2 shirt1 = new Shirt2();
    Shirt2 shirt2 = new Shirt2('G');
    Shirt2 shirt3 = new Shirt2('B', 64.99);
    Shirt2 shirt4 = new Shirt2('T', 64.99);
    System.out.println();

    System.out.println("shirt1 Color Code: " + shirt1.getColorCode());
    System.out.println();

    System.out.println("shirt2 Color Code: " + shirt2.getColorCode());
    System.out.println("shirt2 price: " + shirt2.getPrice());
    System.out.println();

    System.out.println("shirt3 Color Code: " + shirt3.getColorCode());
    System.out.println("shirt3 price: " + shirt3.getPrice());
    System.out.println();

    System.out.println("shirt4 Color Code: " + shirt4.getColorCode());
    System.out.println("shirt4 price: " + shirt2.getPrice());
    System.out.println();

  }
}
