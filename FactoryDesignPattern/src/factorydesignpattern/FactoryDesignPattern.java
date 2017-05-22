/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author OMI
 */
public class FactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape shape = ShapeFactory.getShape("circle");
        shape.rotate();
        
        shape = ShapeFactory.getShape("square");
        shape.rotate();
        
        shape = ShapeFactory.getShape("rectangle");
        shape.rotate();
        
        
        
    }
}
