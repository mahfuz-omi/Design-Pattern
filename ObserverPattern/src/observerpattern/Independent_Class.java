/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMI
 */
public class Independent_Class implements Subject{
    List<Observer> observers;
    String status;

    public Independent_Class() {
        this.observers = new ArrayList<>();
        this.status = "";
    }
    
    void setStatus(String status)
    {
        this.status = status;
        this.notifyObservers();
    }
    
    

    @Override
    public void addObserver(Observer ob) {
        this.observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        this.observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob:observers)
        {
            ob.update(this.status);
        }
    }
    
}
