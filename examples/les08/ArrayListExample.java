import java.util.ArrayList;
public class ArrayListExample {
    public static void main (String args[]) {
        ArrayList myList; // Declare

        myList = new ArrayList(); // Instantiate

        myList.add("John");     // Initialize
        myList.add("Ming");
        myList.add("Mary");
        myList.add("Prashant");
        myList.add("Desmond");
        myList.remove(0);
        myList.remove(myList.size()-1);
        myList.remove("Mary");

        System.out.println(myList);
    }
}
