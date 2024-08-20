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
 * Hanoi solver test
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class HanoiSolverTest extends TestCase {
    //~ Fields ................................................................
    private HanoiSolver hanoi;
    //~ Constructors ..........................................................
    
    /**
     * setUp.
     */
    public void setUp() {
        hanoi = new HanoiSolver(3);
        
    }

    //~Public  Methods ........................................................
    
    /**
     * testDisk.
     */
    public void testDisks() {
        assertEquals(3, hanoi.disks());
    }
    
    /**
     * tesgetTower.
     */
    public void testGetTower() {
        Tower left = new Tower(Position.LEFT);
        Tower middle = new Tower(Position.MIDDLE);
        Tower right = new Tower(Position.RIGHT);
        assertEquals(right.position(), 
            hanoi.getTower(Position.RIGHT).position());
        assertEquals(left.position(), 
            hanoi.getTower(Position.LEFT).position());
        assertEquals(middle.position(), 
            hanoi.getTower(Position.MIDDLE).position());
    }
    
    /**
     * tests toString.
     */
    public void testToString() {
        Disk disk1 = new Disk(10);
        Disk disk2 = new Disk(20);
        Disk disk3 = new Disk(30);
        hanoi.getTower(Position.LEFT).push(disk1);
        hanoi.getTower(Position.MIDDLE).push(disk2);
        hanoi.getTower(Position.RIGHT).push(disk3);   
        
        assertEquals("[10][20][30]", hanoi.toString()); 
    }
    
    /**
     * testsolve.
     */
    public void testSolve() {
        Disk disk1 = new Disk(10);
        Disk disk2 = new Disk(20);
        Disk disk3 = new Disk(30);
        hanoi.getTower(Position.LEFT).push(disk3);
        hanoi.getTower(Position.LEFT).push(disk2);
        hanoi.getTower(Position.LEFT).push(disk1);
        hanoi.solve();
        assertEquals("[][][10, 20, 30]", hanoi.toString());
    
    }

}
