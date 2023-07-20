package main.java.com.inventory.inventory.algorithms;

import java.util.LinkedList;
import java.util.List;

public class Algorithms<T> {
    public List<T> linearSearch(List<T> items, String query) {
        List<T> newList = new LinkedList<>();
        for (T item :
                items) {
            if (item.toString().toLowerCase().contains(query.toLowerCase())) {
                newList.add(item);
            }
        }
        return newList;
    }
}
