/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerpattern;

/**
 *
 * @author OMI
 */
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject Independent = new Independent_Class();
        Observer dependent1 = new Dependent_Class("omi");
        Observer dependent2 = new Dependent_Class("popy");
        Independent.addObserver(dependent2);
        Independent.addObserver(dependent1);
        Independent_Class ic = (Independent_Class)Independent;
        ic.setStatus("available now");
    }
    
}
