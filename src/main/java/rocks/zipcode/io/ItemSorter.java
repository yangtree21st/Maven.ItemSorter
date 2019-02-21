package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

     Item[] items ;
    public ItemSorter(Item[] items)  {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {


        Item[] sortedArray = items;
        for (int i = 1; i < sortedArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if(comparator.compare(sortedArray[j], sortedArray[j-1]) < 0) {
                    Item temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j-1];
                    sortedArray[j-1] = temp;
                }

            }
        }
        return sortedArray;
    }
    }

