package cs2.adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTester {
    Stack<Integer> s;
    
    @BeforeEach
    public void init() {
        s = new LinkedStack<>();
    }

    @Test
    public void testPushPop() {
        assertEquals(s.isEmpty(), true);
        s.push(1);
        s.push(2);
        assertEquals(s.isEmpty(), false);
        assertEquals(s.peek(), 2);
        assertEquals(s.pop(), 2);
        assertEquals(s.peek(), 1);
        assertEquals(s.pop(), 1);
        assertEquals(s.isEmpty(), true);
    }

    @Test
    public void testLotsOfPushPop() {
        for(int i=0; i<100; i++) {
            s.push(i);
        }
        assertEquals(s.isEmpty(), false);
        for(int i=99; i>=0; i--) {
            assertEquals(s.peek(), i);
            assertEquals(s.pop(), i);
        }
        assertEquals(s.isEmpty(), true);
        for(int i=0; i<100; i++) {
            s.push(i);
        }
        assertEquals(s.isEmpty(), false);
        for(int i=99; i>=50; i--) {
            assertEquals(s.peek(), i);
            assertEquals(s.pop(), i);
        }
        for(int i=0; i<100; i++) {
            s.push(i);
        }
        for(int i=99; i>=0; i--) {
            assertEquals(s.peek(), i);
            assertEquals(s.pop(), i);
        }
        for(int i=49; i>=0; i--) {
            assertEquals(s.peek(), i);
            assertEquals(s.pop(), i);
        }
        assertEquals(s.isEmpty(), true);
        //s.pop();
    }

    @Test
    public void testExceptions() {
        try {
            s.peek();
            fail("EmptyStackException not thrown from peek");
        } catch(EmptyStackException e) {
            //Do nothing
        } catch(Exception e) {
            fail("Wrong exception thrown: " + e.getMessage());
            
        }
        
    }

}
