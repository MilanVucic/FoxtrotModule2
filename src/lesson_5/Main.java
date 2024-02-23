package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Task("1", "", 10, 100));
        priorityQueue.add(new Task("2", "", 8, 100));
        priorityQueue.add(new Task("3", "", 5, 100));
        priorityQueue.add(new Task("4", "", 10, 100));
        priorityQueue.add(new Task("5", "", 10, 100));
        priorityQueue.add(new Task("6", "", 5, 100));
        priorityQueue.add(new Task("7", "", 11, 100));
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}
