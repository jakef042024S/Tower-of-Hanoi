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
 *  TowerTest.
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class TowerTest extends TestCase {
    //~ Fields ................................................................
    private Tower left;



    //~ Constructors ..........................................................
    
    /**
     * setUp.
     */
    public void setUp() {
        left = new Tower(Position.LEFT);
    }

    //~Public  Methods ........................................................
    // ----------------------------------------------------------
    /**
     * testPostion.
     */
    public void testPosition() {    
        assertEquals(Position.LEFT, left.position());
    }
    
    // ----------------------------------------------------------
    /**
     * testPush.
     */
    public void testPush() {
        Exception exception = null;
        Disk disk = new Disk(5);
        Disk disk1 = new Disk(10);
        Disk disk2 = new Disk(20);
        left.push(disk1);
        try {
            left.push(null);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        
        try {
            left.push(disk2);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        
        left.push(disk);
        assertEquals(disk, left.peek());
    }

}
