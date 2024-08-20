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
 *  Disk Test
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class DiskTest extends TestCase {
    //~ Fields ................................................................
    private Disk disk1;
    private Disk disk2;
    private Disk disk3;

    //~ Constructors ..........................................................
    
    /**
     * setUp()
     */
    public void setUp() {
        disk1 = new Disk(10);
        disk2 = new Disk(20);
        disk3 = new Disk(20);
    }
    //~Public  Methods ........................................................
    

    /**
     * test compareTo()
     */
    public void testCompareTo() {
        Exception exception = null;
        try {
            disk1.compareTo(null);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        
        assertEquals(10, disk2.compareTo(disk1));
    }
    
    /**
     * test toString()
     */
    public void testToString() {
        assertEquals("10", disk1.toString());
    }
    
    /**
     * test equals()
     */
    public void testEquals() {
        Object obj = new Object();
        assertTrue(disk1.equals(disk1));
        assertTrue(disk2.equals(disk3));
        assertFalse(disk1.equals(null));
        assertFalse(disk1.equals(disk2));
        assertFalse(disk1.equals(obj));
    }
    
}

