/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdesignpattern;

import java.util.List;

/**
 *
 * @author OMI
 */
///this adapter class will use PrintString class
public class PrintListAdapter {

    PrintString printString = new PrintString();

    public void printList(List<String> list) {
        for (String str : list) {
            printString.print(str);
        }

    }
}
