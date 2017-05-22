/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpattern;

/**
 *
 * @author OMI
 */
public class MementoDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CareTaker careTaker = new CareTaker();
        Originator org1 = new Originator(5, 10,"omi");
        careTaker.add(org1.toMemento());
        Originator org2 = new Originator(careTaker.get(0));
        Originator org3 = new Originator();
        org3.fromMemento(careTaker.get(0));
        
        System.out.println(org1);
        System.out.println(org2);
        System.out.println(org3);
        
    }
}
