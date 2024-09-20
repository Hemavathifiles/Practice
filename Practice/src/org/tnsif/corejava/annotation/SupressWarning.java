package org.tnsif.corejava.annotation;

import java.util.ArrayList;
import java.util.List;

public class SupressWarning{
    @SuppressWarnings("unchecked")
    public void addItems() {
        List list = new ArrayList();  // This will normally generate a warning
        list.add("Item 1");
        list.add("Item 2");
        
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
    	SupressWarning main = new SupressWarning();
        main.addItems();  // Output: Item 1, Item 2
    }
}

