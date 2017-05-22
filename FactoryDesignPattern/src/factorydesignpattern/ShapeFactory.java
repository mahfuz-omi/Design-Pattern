/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author OMI
 */
public class ShapeFactory {
    
    public static Shape getShape(String type)
    {
        if(type.equals("circle"))
        {
            return new Circle();
        }
        else if(type.equals("square"))
        {
            return new Square();
        }
        else if(type.equals("rectangle"))
        {
            return new Rectangle();
        }
        return null;
        
    }
    
}
