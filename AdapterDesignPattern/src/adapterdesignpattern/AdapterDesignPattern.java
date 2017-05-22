/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMI
 */
public class AdapterDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintListAdapter adapter = new PrintListAdapter();
        List<String> messages = new ArrayList<>();
        messages.add("omi");
        messages.add("amma");
        messages.add("abba");
        adapter.printList(messages);
    }
}
