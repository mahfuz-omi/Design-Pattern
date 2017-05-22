/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author OMI
 */
public class Dependent_Class implements Observer{
    String name;

    public Dependent_Class(String name) {
        this.name = name; 
    }
    
    

    @Override
    public void update(String status) {
        System.out.println(this.name+" got "+status);
        this.name = status;
    }
    
}
