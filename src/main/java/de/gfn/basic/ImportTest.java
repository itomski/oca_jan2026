package de.gfn.basic;

import static de.gfn.basic.Wochentag.DI;

public class ImportTest {

    public static void main(String[] args) {

        Wochentag tag = DI;

        byte b = 100;

        switch(b) {
            case 100:
                System.out.println(1);

//            case 200:
//                System.out.println(2);
//
//            case 300:
//                System.out.println(3);
        }

        machWas(b); // primitive widening

        int[] arrI = {1,2,3};
        System.out.println(arrI instanceof Object);
//        double[] arrD = arrI;
//        Integer[] arrII = arrI;
        // ObjectArray ist nicht das gleiche wie Object
//        Object[] arrO = arrI; // Array von Object != Array von int
        Object arrOO = arrI;

        int i = 10;
        i++;

        Integer j = 10;
        j++; // j = (Integer)(j + 1)

        byte b1 = 10; // b1 = (byte)(b1 + 1);

        // j.intValue() // zu primitiv


    }

    static void machWas(int i) {

    }
}
