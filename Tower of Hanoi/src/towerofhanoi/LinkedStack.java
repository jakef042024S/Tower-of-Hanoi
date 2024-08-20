// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with 
// honor and integrity at all times.
// I will not lie, cheat, or steal, nor 
// will I accept the actions of those who do.
// -- Jake Fortuna
package towerofhanoi;

import java.util.EmptyStackException;
import stack.StackInterface;

// -------------------------------------------------------------------------
/**
 *  LinkedStack class
 *  @param <T>
 * 
 *  @author jake
 *  @version Mar 19, 2024
 */
public class LinkedStack<T> implements StackInterface<T> {
    //~ Fields ................................................................
    private Node topNode; 
    private int size;


    //~ Constructors ..........................................................
    
    /**
     * Create a new LinkedStack object.
     */
    public LinkedStack() {
        topNode = null;
        size = 0;
    }

    //~Public  Methods ........................................................
    // ----------------------------------------------------------
    /**
     * size
     * @return size
     */
    public int size() {
        return size;
    }
    @Override
    public void clear() {
        topNode = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public T peek() {        
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topNode.getData();
    }

    @Override
    public T pop() {
        T top = peek();
        topNode = topNode.getNextNode();
        size--;
        return top;
    }

    @Override
    public void push(T newEntry) {
        topNode = new Node(newEntry, topNode);
        size++;
    } 
    
    /**
     * toString.
     * 
     * @return String
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node current = topNode;
        while (current != null) {
            if (str.length() > 1) {
                str.append(", ");
            }
            str.append(current.getData());
            current = current.getNextNode();
        }
        str.append("]");
        return str.toString();
    }
    
    private class Node {
        
        private T data;
        private Node next;
        
        public Node(T entry, Node node) {
            this(entry);
            this.setNextNode(node);
            
        }
        
        public Node(T data) { 
            this.data = data; 
        }
        
        public T getData() {
            return data;
        }
        
        public Node getNextNode() {
            return next;
        }

        public void setNextNode(Node nextNode) {
            next = nextNode;
        }
        
    }
    
}
