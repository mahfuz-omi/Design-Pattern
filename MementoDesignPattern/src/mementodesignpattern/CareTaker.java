/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMI
 */
public class CareTaker {
    
    List<Memento> list;

    public CareTaker() {
        list = new ArrayList<>();
    }
    
    public void add(Memento memento)
    {
       list.add(memento); 
    }
    
    public Memento get(int i)
    {
        return list.get(i);
    }
    
    
    
}
