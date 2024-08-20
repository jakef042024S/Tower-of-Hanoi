// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with 
// honor and integrity at all times.
// I will not lie, cheat, or steal, nor 
// will I accept the actions of those who do.
// -- Jake Fortuna

package towerofhanoi;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Linked stack test
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class LinkedStackTest extends TestCase {
    //~ Fields ................................................................
    private LinkedStack<String> stack;
    private LinkedStack<String> stack2;
    private Exception exception;
    //~ Constructors ..........................................................
    
    /**
     * setUp.
     */
    public void setUp() {
        
        stack = new LinkedStack<String>();
        stack.push("A");
        stack.push("B");
        
        stack2 = new LinkedStack<String>();
        
        exception = null;
    }

    //~Public  Methods ........................................................
 
    // ----------------------------------------------------------
    /**
     * testSize.
     */
    public void testSize() {
        assertEquals(2, stack.size());
    }
    
    // ----------------------------------------------------------
    /**
     * testclear.
     */
    public void testClear() {
        stack.clear();
        assertEquals(0, stack.size());
    }
    
    // ----------------------------------------------------------
    /**
     * testisEmpty.
     */
    public void testIsEmpty() {
        assertFalse(stack.isEmpty());
        assertTrue(stack2.isEmpty());
    }
    
    // ----------------------------------------------------------
    /**
     * testPeek.
     */
    public void testPeek() {
        assertEquals("B", stack.peek());
        try {
            stack2.peek();
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
    }
    
    // ----------------------------------------------------------
    /**
     * testPop.
     */
    public void testPop() {
        assertEquals("B", stack.pop());
        try {
            stack2.pop();
        }
        catch (Exception e) {
            exception = e;
        }
    }
    
    // ----------------------------------------------------------
    /**
     * testToString.
     */
    public void testToString() {
        assertEquals("[B, A]", stack.toString());
    }

}
