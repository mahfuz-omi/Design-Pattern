/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;

/**
 *
 * @author OMI
 */
public class IteratorDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterator iterator;
        iterator = new Facebook();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        System.out.println("\n");
        
        iterator = new Twitter();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
