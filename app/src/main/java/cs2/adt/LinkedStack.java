package cs2.adt;

public class LinkedStack<T> extends Stack<T> {
    private class Node {
        public T data; public Node next;
        public Node(T d, Node n) {
            data = d; next = n;
        }
    }

    private Node head;

    public LinkedStack() {
        head = null;
    }

    public void push(T elem);
    public T pop();
    public T peek() {
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    
}
