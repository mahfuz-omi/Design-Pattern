/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author OMI
 */
public class StrategyDesignpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // delegation Pattern er sathe mil ache...
        Strategy strategy = new Add();
        System.out.println(strategy.doOperation(1,2));
        strategy = new Subtract();
        System.out.println(strategy.doOperation(1,2));
        
    }
}
