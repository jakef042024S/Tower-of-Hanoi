// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with 
// honor and integrity at all times.
// I will not lie, cheat, or steal, nor 
// will I accept the actions of those who do.
// -- Jake Fortuna
package towerofhanoi;
import cs2.Shape;
import java.awt.Color;
import student.TestableRandom;
// -------------------------------------------------------------------------
/**
 *  Disk class.
 * 
 *  @author jake
 *  @version Mar 18, 2024
 */
public class Disk extends Shape implements Comparable<Disk> {
    // ----------------------------------------------------------
    /**
     * constructor
     *
     * @param width
     *            the width
     */
    //~ Constructors ..........................................................
    public Disk(int width) {
        super(0, 0, width, 15); 
        // Creates a random color given a random number 
        // generated from 0-255 for rbg
        TestableRandom randomGenerator = new TestableRandom();
        int r = randomGenerator.nextInt(256);
        int g = randomGenerator.nextInt(256);
        int b = randomGenerator.nextInt(256);
        this.setBackgroundColor(new Color(r, g, b));
    }

    //~Public  Methods ........................................................
    /**
     * compareTo.
     * @param o
     */
    @Override
    public int compareTo(Disk o) {
        if (o == null) {
            throw new IllegalArgumentException();
        }
        
        // negative is this is smaller
        int compare = this.getWidth() - o.getWidth();
        
        return compare;
    }
    
    /**
     * toString()
     *
     * @return String
     */
    public String toString() {
        String str = String.valueOf(this.getWidth());
        return str;
    }
    
    /**
     * constructor
     *
     * @param obj
     *            the object
     *            
     * @return boolean
     *                 returns true if equal else not
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (this.getClass() == obj.getClass()) {
            Disk other = (Disk)obj;
            return this.getWidth() == other.getWidth();   
        }
        return false;
    }


}
