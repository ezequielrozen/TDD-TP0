package tp0.cola;

import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedQueueTest {
    
    public LinkedQueueTest() {
    }
    
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("TEST: Is Empty?");
        LinkedQueue instance = new LinkedQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testSizeZero() {
        System.out.println("TEST: Size == 0");
        LinkedQueue instance = new LinkedQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testSizeNonZero() {
        System.out.println("TEST: Size > 0");
        LinkedQueue instance = new LinkedQueue();
        instance.add(3);
        instance.add(6);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    
    @org.junit.Test
    public void testAdd() {
        System.out.println("TEST: Add/Top");
        int item = 33;
        LinkedQueue instance = new LinkedQueue();
        instance.add(item);
        assertEquals(33,(int)instance.top());
    }

    @Test(expected=AssertionError.class)
    public void testTop() {
        System.out.println("TEST: Top Empty");
        LinkedQueue instance = new LinkedQueue();
        instance.top();
    }

    @Test(expected=AssertionError.class)
    public void testRemoveEmpty() {
        System.out.println("TEST: Remove Empty");
        LinkedQueue instance = new LinkedQueue();
        instance.remove();
    }
    
    @org.junit.Test
    public void testRemove() {
        System.out.println("TEST: Remove");
        LinkedQueue instance = new LinkedQueue();
        instance.add(3);
        instance.remove();
        assertTrue(instance.isEmpty());
    }
}
