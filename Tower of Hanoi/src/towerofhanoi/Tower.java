// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with 
// honor and integrity at all times.
// I will not lie, cheat, or steal, nor 
// will I accept the actions of those who do.
// -- Jake Fortuna

package towerofhanoi;
// -------------------------------------------------------------------------
/**
 *  Tower class.
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class Tower extends LinkedStack<Disk> {
    //~ Fields ................................................................
    private Position position;

    //~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Create a new Tower object.
     * @param position
     *                 postion
     */
    public Tower(Position position) {
        super();
        this.position = position;
    }
    //~Public  Methods ........................................................
    // ----------------------------------------------------------
    /**
     * returns positon.
     * @return postion
     */
    public Position position() {
        return position;
    }

    @Override
    public void push(Disk disk) {
        if (disk == null) {
            throw new IllegalArgumentException();
        }
            
        if (super.isEmpty() || disk.compareTo(super.peek()) < 0) {
            super.push(disk);
        }
        
        else {
            throw new IllegalStateException();
        }
    }
}
