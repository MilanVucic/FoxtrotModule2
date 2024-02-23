package lesson_5;

public class MyArray<T> {
    private T[] array;
    private int size;

    public T get(int index) {
        return array[index];
    }

    public void add(T elem) {

    }

    // array, linked list, arraylist, stack, queue, set, map

    //      10       6
    // { {1,2,3}, {5,3,2}

    // SortedMap<Integer, List<Task>>
    // item1, prio: 10 -> map: 10 -> [item1]
    // item2, prio: 8  -> map: 10 -> [item1], 8 -> [item2]
    // item3, prio: 8  -> map: 10 -> [item1], 8 -> [item2, item3]
    // item4, prio: 10  -> map: 10 -> [item1, item4], 8 -> [item2, item3]
}
