// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with 
// honor and integrity at all times.
// I will not lie, cheat, or steal, nor 
// will I accept the actions of those who do.
// -- Jake Fortuna
package towerofhanoi;
import java.util.Observable;
// -------------------------------------------------------------------------
/**
 *  HanoiSolver class
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class HanoiSolver extends Observable {
    //~ Fields ................................................................
    private Tower left;
    private Tower right;
    private Tower middle;
    private int numDisks;


    //~ Constructors ..........................................................
    
    /**
     * Create a new HanoiSolver object.
     * @param numDisks
     *                 the number of disks
     */
    public HanoiSolver(int numDisks) {
        this.numDisks = numDisks;
        left = new Tower(Position.LEFT);
        right = new Tower(Position.RIGHT);
        middle = new Tower(Position.MIDDLE);
    }
    //~Public  Methods ........................................................
    
    /**
     * return numDisks.
     * @return numDisks
     */
    public int disks() {
        return numDisks;
    }
    
    // ----------------------------------------------------------
    /**
     * gets tower.
     * @param pos
     *            the positon
     *    
     * @return tower
     */
    public Tower getTower(Position pos) {
        switch(pos) {
            case LEFT:
                return left;
            case RIGHT:
                return right;
            case MIDDLE:
                return middle;
            default:
                return middle;
        }
    }
    
    /**
     * toString.
     * @return string
     */
    public String toString() {
        String str = left.toString() + middle.toString() + right.toString();
        
        return str;
    }
    
    // ----------------------------------------------------------
    /**
     * moves the disks.
     * @param source
     * @param destination
     */
    private void move(Tower source, Tower destination) {
        Disk orig = source.pop();
        destination.push(orig);
        setChanged();
        notifyObservers(destination.position());
    }

    // ----------------------------------------------------------
    /**
     * solves the towers through recursion.
     * @param currentDisks
     * @param startPole
     * @param tempPole
     * @param endPole
     */
    private void solveTowers(int currentDisks, Tower startPole, Tower tempPole, 
        Tower endPole) {
        
        if (currentDisks == 1) {
            move(startPole, endPole);
        }
        else {
            //Recursion here because 
            solveTowers(currentDisks - 1, startPole, endPole, tempPole);
            move(startPole, endPole);
            solveTowers(currentDisks - 1, tempPole, startPole, endPole);
        }
  
    }
    
    // ----------------------------------------------------------
    /**
     * solve method.
     */
    public void solve() {
        solveTowers(numDisks, left, middle, right);
    }
    
    
    
    
}
