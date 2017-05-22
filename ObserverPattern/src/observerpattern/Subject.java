/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author OMI
 */
public interface Subject {
    
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
    
}
