package duke.init;

import duke.item.*;
import java.util.*;

public class DukesDB {

    static final int DRESS_SHIRT = 110;
    static final int CASUAL_SHIRT = 111;
    static final int CUSTOM_SHIRT = 112;
    static final int DRESS_TROUSERS = 120;
    static final int CASUAL_TROUSERS = 121;
    static final int DRESS_SOCKS = 130;
    static final int SPORTS_SOCKS = 131;
    static final int TENT = 310;
    static final int CAMPING_STOVE = 320;
    static final int CAMPING_STOVE_FUEL = 330;
    static final int DRESS_SUIT = 410;
    private List items = new ArrayList();
    private List selectedItems = new ArrayList();

    public void setupDb() {

        addItems(new Suit(DRESS_SUIT, "Dress Suit", 'B', 'D', 999.99, 21));
        addItems(new Suit(DRESS_SUIT, "Dress Suit", 'B', 'S', 789.99, 15));
        addItems(new Suit(DRESS_SUIT, "Dress Suit", 'G', 'D', 999.99, 14));
        addItems(new Suit(DRESS_SUIT, "Dress Suit", 'W', 'S', 789.99, 18));

        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 'S', 87.99, 22));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'B', 'S', 65.55, 13));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'G', 'R', 94.01, 12));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 'C', 73.49, 23));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 'R', 67.99, 14));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'B', 'R', 67.99, 12));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 'C', 67.99, 17));
        addItems(new Trousers(DRESS_TROUSERS, "Dress Trousers", 'T', 'R', 67.99, 9));
        
        addItems(new Shirt(CASUAL_SHIRT, "Casual Shirt", 'R', 34.29, 32));
        addItems(new Shirt(CASUAL_SHIRT, "Casual Shirt", 'R', 34.29, 31));
        addItems(new Shirt(CASUAL_SHIRT, "Casual Shirt", 'B', 25.05, 20));

        addItems(new Socks(SPORTS_SOCKS, "Sports Socks", 'R', 5.99, 34));

        addItems(new Socks(DRESS_SOCKS, "Dress Socks", 'B', 7.99, 78));

        addItems(new Tent(TENT, "Elite Tent", 3, 55.00, 23));
        addItems(new Tent(TENT, "Elite Tent", 4, 65.00, 23));
        addItems(new Tent(TENT, "Handypack Tent", 2, 45.00, 23));

        addItems(new CampingFuel(CAMPING_STOVE_FUEL, "Smokeless camp stove fuel", 'M', 7.00, 1));

    }

    public DukesDB() {
    }

    private void addItems(Searchable item) {
        int theIndex = 0;
        // Does this item already exist?
        for (Object currItem : items) {
            if (((Searchable) currItem).getSku().equals(item.getSku())) {
                break;
            }
            theIndex++; // Final value will be arrayList size i.e. not a valid index
        }

        if (theIndex == items.size()) {
            // Didn't find an item
            items.add(item);
        } else {
            //System.out.println("Incrementing a quantity in stock");
            Searchable currItem = (Searchable) items.get(theIndex);
            currItem.setQuantityInStock(currItem.getQuantityInStock() + item.getQuantityInStock());
        }

    }

    // Used for the dropdown
    public Searchable[] findUniqueItems() {
        selectedItems.clear();

        outer:
        for (Object element : items) {
            // if item not already in list
            for (Object selection : selectedItems) {
                if (((Searchable) element).getItemID() == ((Searchable) selection).getItemID()) {
                    continue outer;
                }
            }
            selectedItems.add(element);
        }

        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }

    // Return all items
    public Searchable[] findItems() {
        selectedItems.clear();

        for (Object element : items) {
            // if item not already in list
            selectedItems.add(element);

        }
        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }

    // Return all items by Item Id
    public Searchable[] findItems(int itemId) {
        selectedItems.clear();

        for (Object element : items) {
            if (((Searchable) element).getItemID() == itemId) {
                // Check if one like this exists?
                selectedItems.add(element);
            }
        }
        Searchable[] foundItems = new Searchable[selectedItems.size()];
        selectedItems.toArray(foundItems);
        return foundItems;

    }

    // Find by SKU
    public Searchable findItem(String sku) {
        Searchable foundItem = null;
        for (Object currItem : items) {
            if (((Searchable) currItem).getSku().equals(sku)) {
                foundItem = (Searchable) currItem;
                break; // Should be only one element per SKU (sku like primary key)
            }
        }
        return foundItem;
    }

    // Could throw Exception if try to remove too many items
    // This code just returns number of items removed
    public int removeItem(String sku, int numberOfItems) {

        int returnValue = 0;
        int theIndex = 0;
        // Does this item  exist?
        for (Object currItem : items) {
            if (((Searchable) currItem).getSku().equals(sku)) {
                break;
            }
            theIndex++; // Final value will be arrayList size i.e. not a valid index (do/while better?)
        }

        if (theIndex == items.size()) {
            return 0; // or poss throw Exception

        } else {
            Searchable currItem = (Searchable) items.get(theIndex);
            int quantity = currItem.getQuantityInStock();

            if (quantity <= numberOfItems) {  // remove the entire entry
                items.remove(theIndex);
                returnValue = quantity;

            } else { // enough items to remove all requested
                currItem.setQuantityInStock(currItem.getQuantityInStock() - numberOfItems);
                returnValue = numberOfItems;
            }
        }
        return returnValue;
    }
}
