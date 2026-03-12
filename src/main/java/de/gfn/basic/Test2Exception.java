package de.gfn.basic;

import java.io.IOException;

public class Test2Exception {

    public static void main(String[] args) {

        try {
            int[] i = new int[-10];
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {

        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            machWas();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        C1 c = new C1();
        //C2 cx = (C2)c;
        C2 cx = (C2)new C1();

        int i = 10;
        int j = 20;

        System.out.println("Erg: " + i + j);
        System.out.println("Erg: " + i * j + 10);
        // System.out.println("Erg: " + i - j); // - bei String nicht erlaubt!

    }

    public static void machWas() throws IOException {

    }
}

class C1 {

}

class C2 extends C1 {

}
