package lesson_15;

import java.util.EmptyStackException;

public class MyStack<T> {
    private Node<T> head;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public T pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        T value = head.value;
        head = head.next;

        return value;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
