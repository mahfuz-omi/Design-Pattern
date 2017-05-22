/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethoddesignpattern;

/**
 *
 * @author OMI
 */
public class Gmail extends EmailBase{

    @Override
    void checkMailAddress() {
        System.out.println("checking gmail");
    }

    @Override
    void validateMessage() {
        System.out.println("validating gmail");
    }

    @Override
    void sendMail() {
        System.out.println("sending gmail");
    }
    
}
