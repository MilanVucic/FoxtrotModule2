package lesson_5;

import java.util.*;

public class PriorityQueue<T extends HasPriority> {
    private SortedMap<Integer, List<T>> items;

    public PriorityQueue() {
        items = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    public void add(T item) {
        List<T> values;
        if (items.containsKey(item.getPriority())) {
            values = items.get(item.getPriority());
        } else {
            values = new ArrayList<>();
        }
        values.add(item);
        items.put(item.getPriority(), values);
    }

    public T remove() {
        Integer key = items.firstKey();
        if (key != null) {
            List<T> values = items.get(key);
            if (values.size() > 0) {
                T value = values.remove(0);
                if (values.size() == 0) {
                    items.remove(key);
                }
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + items +
                '}';
    }
}
