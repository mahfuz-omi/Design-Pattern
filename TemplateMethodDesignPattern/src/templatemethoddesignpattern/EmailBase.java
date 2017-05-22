/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethoddesignpattern;

/**
 *
 * @author OMI
 */
public abstract class EmailBase {
    
    public final void sendEmail() // template method
    {
        checkMailAddress();
        validateMessage();
        sendMail();    
    }

    abstract void checkMailAddress(); 

    abstract void validateMessage(); 

    abstract void sendMail();
    
    
}
