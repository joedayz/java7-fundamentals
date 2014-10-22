
public class ShirtTest {
    public static void main (String args[]) {

        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt = yourShirt;

        myShirt.colorCode = 'R';
        yourShirt.colorCode = 'G';

        System.out.println("Shirt color: " + myShirt.colorCode);

        myShirt.display();
    }
}
