package genericStack;

import java.util.EmptyStackException;

public class GenericLinkStack<T> {
    private Node<T> top;

    // Inner Node class
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    // Constructor
    public GenericLinkStack() {
        this.top = null;
    }

    // Push method
    public void push(T data) {
        top = new Node<>(data, top);
    }

    // Pop method
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    // Peek method
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }
}
