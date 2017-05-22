/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;

/**
 *
 * @author OMI
 */
public class Twitter implements Iterator{
    String[] names;
    int position = 0;

    public Twitter() {
        names = new String[4];
        names[0] = "trishna";
        names[1] = "swarna";
        names[2] = "nupur";
        names[3] = "alisa";
        
    }

    @Override
    public boolean hasNext() {
        if(this.position >= names.length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return names[position++];
    }
    
    
    
}
