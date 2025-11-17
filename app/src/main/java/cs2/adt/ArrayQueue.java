package cs2.adt;

class QueueEmptyException extends RuntimeException {}

public class ArrayQueue<T> extends Queue<T> {
    private int len;
    private int beg;
    private T[] arr;

    public ArrayQueue() {
        len = 0;
        beg = 0;
        arr = (T[]) new Object[10];
    }

    public void enqueue(T elem) {
        if(len == arr.length) {
            T[] tmp = (T[]) new Object[len * 2];
            for(int i=0; i<arr.length; i++) {
                tmp[i] = arr[(beg + i) % arr.length];
            }
            arr = tmp;
            beg = 0;
        }
        arr[(beg + len) % arr.length] = elem;
        len++;
    }
    public T dequeue() throws QueueEmptyException {
        if(isEmpty()) throw new QueueEmptyException();
        T tmp = arr[beg];
        beg = (beg + 1) % arr.length;
        len--;
        return tmp;
    }
    public T peek() throws QueueEmptyException { 
        if(isEmpty()) throw new QueueEmptyException();
        return arr[beg];
    }
    public boolean isEmpty() { return len == 0; }
}
