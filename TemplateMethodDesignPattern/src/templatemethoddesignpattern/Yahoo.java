/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethoddesignpattern;

/**
 *
 * @author OMI
 */
public class Yahoo extends EmailBase{

    @Override
    void checkMailAddress() {
        System.out.println("checking yahoo mail");
    }

    @Override
    void validateMessage() {
        System.out.println("validating yahoo mail");
    }

    @Override
    void sendMail() {
        System.out.println("sending yahoo mail");
    }
    
}
