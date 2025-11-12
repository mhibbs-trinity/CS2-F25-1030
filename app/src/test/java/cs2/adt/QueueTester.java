package cs2.adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTester {
    Queue<Integer> s;
    
    @BeforeEach
    public void init() {
        s = new ArrayQueue<Integer>();
    }

    @Test
    public void testEnDequeue() {
        try {
            assertEquals(s.isEmpty(), true);
            s.enqueue(1);
            s.enqueue(2);
            assertEquals(s.isEmpty(), false);
            assertEquals(s.peek(), 1);
            assertEquals(s.dequeue(), 1);
            assertEquals(s.peek(), 2);
            assertEquals(s.dequeue(), 2);
            assertEquals(s.isEmpty(), true);
        } catch(Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testLotsOfEnDequeue() {
        try {
            for(int i=0; i<100; i++) {
                s.enqueue(i);
            }
            assertEquals(s.isEmpty(), false);
            for(int i=0; i<100; i++) {
                assertEquals(s.peek(), i);
                assertEquals(s.dequeue(), i);
            }
            assertEquals(s.isEmpty(), true);
            for(int i=0; i<100; i++) {
                s.enqueue(i);
            }
            assertEquals(s.isEmpty(), false);
            for(int i=0; i<50; i++) {
                assertEquals(s.peek(), i);
                assertEquals(s.dequeue(), i);
            }

            for(int i=0; i<100; i++) {
                s.enqueue(i);
            }
            for(int i=50; i<100; i++) {
                assertEquals(s.peek(), i);
                assertEquals(s.dequeue(), i);
            }
            for(int i=0; i<100; i++) {
                assertEquals(s.peek(), i);
                assertEquals(s.dequeue(), i);
            }
            
            assertEquals(s.isEmpty(), true);
        } catch(Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testExceptions() {
        try {
            s.peek();
            fail("EmptyStackException not thrown from peek");
        }
        catch(QueueEmptyException e) {
            //Do nothing
        } catch(Exception e) {
            fail("Wrong exception thrown: " + e.getMessage());
            
        }
        
    }

}
