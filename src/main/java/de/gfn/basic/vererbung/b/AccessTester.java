package de.gfn.basic.vererbung.b;

import de.gfn.basic.vererbung.a.AccessTest;


public class AccessTester extends AccessTest {
    public static void main(String[] args) {

        // Referenztyp
        // Objekttyp
        AccessTester ref1 = new AccessTester();
        AccessTest ref2 = new AccessTester();
        ref1.c();
//        ref2.c();
    }
}
