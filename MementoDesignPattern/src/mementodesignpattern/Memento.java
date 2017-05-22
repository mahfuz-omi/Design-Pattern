/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpattern;

/**
 *
 * @author OMI
 */
public class Memento {
    int a;
    int b;
    String name;

    public Memento(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }
    
    public Memento(Originator originator)
    {
        this.a = originator.a;
        this.b = originator.b;
        this.name = originator.name;
    }
    
    
    
}
