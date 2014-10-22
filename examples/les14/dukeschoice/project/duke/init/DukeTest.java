package duke.init;

import duke.item.Searchable;

/**
 *
 * main() uses some very basic code to check for parameters added on command line.
 * It's just a simple example of a non-web application that lists items in the 
 * hard-coded database. There is also a web based demo application that uses the
 * classes in this application.
 * 
 */
public class DukeTest {

    public static void main(String[] args) {

        DukesDB theDB = new DukesDB();
        theDB.setupDb();

        String newLine = String.format("%n");
        String helptext = "Please add parameters in the format: " + newLine
                + "   find <item id number>";
        if (args.length == 2) {
            if (args[0].equals("find")) {
                try {
                    int itemID = Integer.parseInt(args[1]);
                    Searchable[] itemsFound = theDB.findItems(itemID);
                    if (itemsFound.length != 0) {
                        displayItems(itemsFound);
                    } else {
                        System.out.println("No items with id " + itemID + " found.");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("The second parameter must be a number.");
                }

            } else {
                System.out.println("The first parameter must be \"find\"");
            }
        } else {
            System.out.println(helptext);
        }
    }

    public static void displayItems(Searchable[] items) {
        String separatorLine = "";

        for (Searchable element : items) {
            String printLine = element.getDisplay(" | ");
            int length = printLine.length();
            separatorLine = new String(new char[length]).replace("\0", "-");
            System.out.println(separatorLine);
            System.out.println(element.getDisplay(" | "));
        }
    }
}
