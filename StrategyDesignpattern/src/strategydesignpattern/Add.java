/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author OMI
 */
public class Add implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a+b;
        
    }
    
}
