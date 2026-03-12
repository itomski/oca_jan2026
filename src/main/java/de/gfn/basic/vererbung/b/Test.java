package de.gfn.basic.vererbung.b;

import de.gfn.basic.vererbung.a.AClass;

public class Test {
    public static void main(String[] args) {

        AClass ac = new AClass();
        //System.out.println(ac.zahl); // Hier wird keine vererbung verwendet!

        BClass bc = new BClass();
        bc.showZahl(); // Hier wird Vererbung verwendet!

    }
}
