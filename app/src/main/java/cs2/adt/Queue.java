package cs2.adt;

public abstract class Queue<T> {
    public abstract void enqueue(T elem);
    public abstract T dequeue() throws QueueEmptyException;
    public abstract T peek() throws QueueEmptyException;
    public abstract boolean isEmpty();
}
