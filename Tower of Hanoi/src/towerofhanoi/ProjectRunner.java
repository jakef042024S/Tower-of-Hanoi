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
 *  project runner
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class ProjectRunner {

    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

    // ----------------------------------------------------------
    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        int disks = 6;
        if (args.length == 1) {
            disks = Integer.parseInt(args[0]);
        }
        else {
            PuzzleWindow puz = new PuzzleWindow(new HanoiSolver(disks));
        }
        
    }
    
}

