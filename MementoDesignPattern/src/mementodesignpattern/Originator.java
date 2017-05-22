/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpattern;

/**
 *
 * @author OMI
 */
public class Originator {
    int a;
    int b;
    String name;
    String optional;
    
    public Originator()
    {
        this.a = 0;
        this.b = 0;
        this.name = "";
        this.optional = "";
        
    }

    public Originator(int a,int b, String name,String optional) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.optional = optional;
    }
    public Originator(int a,int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.optional = "";
    }
    
    public Originator(Memento memento)
    {
        this.a = memento.a;
        this.b = memento.b;
        this.name = memento.name;
        this.optional = "";
        
    }
    
    public Memento toMemento()
    {
        Memento memento = new Memento(this);
        return memento;
        
    }
    
    public void fromMemento(Memento memento)
    {
        this.a = memento.a;
        this.b = memento.b;
        this.name = memento.name;
        this.optional = "";
    }

    @Override
    public String toString() {
        return a+b+name+optional;
    }
    
    
    
    
    
    
    
    
}
