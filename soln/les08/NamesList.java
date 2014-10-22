
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesList {
    public ArrayList listOfNames;
    
    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Joe Smith");
        listOfNames.add("Mary Palmer");
        listOfNames.add("Jose Gonzalez");
        listOfNames.add("Linda Baker");
        
        System.out.println("Names List: " + listOfNames);
        System.out.println("Size of ArrayList: " + listOfNames.size());
    }
    
    public void manipulateList(){
        listOfNames.remove("Joe Smith");
        System.out.println ("Names list after removing element: " + listOfNames);
        System.out.println ("Size of ArrayList: " + listOfNames.size());
        listOfNames.add(1, "Joe Smith");
        System.out.println ("Names list after adding element: " + listOfNames);
        System.out.println ("Size of ArrayList: " + listOfNames.size());
    }
}
