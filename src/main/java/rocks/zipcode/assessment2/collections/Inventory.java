package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    private ArrayList<String> strings;

    public Inventory(ArrayList<String> strings) {

        this.strings = strings;

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

        this.strings = new ArrayList<>(0);

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {


        this.strings.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        this.strings.remove(item);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        int c = 0;
        for (String myItem : strings)
            if (myItem.equals(item)){
                c++;
            }

    return c;
    }
}
