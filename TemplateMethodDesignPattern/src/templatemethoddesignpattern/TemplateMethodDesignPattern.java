/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethoddesignpattern;

/**
 *
 * @author OMI
 */
public class TemplateMethodDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmailBase email = new Gmail();
        email.sendEmail();
        
        email = new Yahoo();
        email.sendEmail();
    }
}
