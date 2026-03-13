package de.gfn.basic.vererbung.b;

import de.gfn.basic.vererbung.a.AClass;

import java.util.ArrayList;
import java.util.List;

public class BClass extends AClass {

    public static void main(String[] args) {

        AClass ac = new AClass();
        //System.out.println(ac.zahl); // Hier wird keine vererbung verwendet!

        BClass bc = new BClass();
        System.out.println(bc.zahl); // Hier wird Vererbung verwendet!

    }

    void showZahl() {
        System.out.println(zahl);
    }
}
