package de.gfn.basic.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

    public static void main(String[] args) {

        List list1 = new ArrayList(); // Referenztyp = List, Objekttyp = ArrayList
        //var list2 = new ArrayList(); // Referenztyp und Objekttyp sind gleich

        list1.add(1);
        list1.add("Moin");
        list1.add(0.5);

        for(Object o : list1) {

            // ClassCastException: Objekt auf dem Heap passt nicht zu dem Cast
            // System.out.println( ((String)o).toLowerCase() );

            if(o instanceof String) {
               System.out.println( ((String)o).toLowerCase() );
           }
            else if(o instanceof Integer) {
                System.out.println( ((Integer)o) + 10);
            }
            else if(o instanceof Double) {
                System.out.println( ((Double)o) + 10);
            }
        }
    }
}
