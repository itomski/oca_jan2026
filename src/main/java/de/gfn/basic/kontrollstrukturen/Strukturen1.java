package de.gfn.basic.kontrollstrukturen;

public class Strukturen1 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = true;

        if(a) System.out.println("a"); // sout gehört zu if

        if(a); System.out.println("a"); // sout gehört nicht mehr zu if

        if(a) System.out.println("a");
            //System.out.println("...");
        else
            System.out.println("b");

        if(a)
            if(b)
                if (c) System.out.println("C");
                else System.out.println("!C");

        if (b) {
            System.out.println("B");
        } else if (c) {
            System.out.println("C");
        }

        System.out.println(a ? "A" : "!A");
        String s = a ? "A" : "!A";
        System.out.println(s);

        System.out.println(a ? "A" : (b ? "B" : "!B"));
    }
}
