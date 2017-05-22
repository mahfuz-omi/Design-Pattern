/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMI
 */
public class Facebook implements Iterator{
    
    List<String> names;
    int position = 0;

    public Facebook() {
        names = new ArrayList<>();
        names.add("omi");
        names.add("popy");
        names.add("sumi");
        names.add("arrna");
    }

    @Override
    public boolean hasNext() {
        if(this.position >= names.size())
            return false;
        return true;
        
        
    }

    @Override
    public Object next() {
        return names.get(position++);
    }
    
    
}
