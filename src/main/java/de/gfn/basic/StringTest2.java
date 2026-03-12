package de.gfn.basic;

public class StringTest2 {

    public static void main(String[] args) {

        String s1 = "Moin";
        String s2 = "Moin";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println();

        s2 = new String("Moin");
        s2 = s2.intern(); // Der Pool wird angezapft
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println();

        System.out.println(0b00101); // Binär
        System.out.println(01234); // Oktal
        System.out.println(0xff001c); // Hex
        System.out.println(123); // Dez

        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toBinaryString(123));

        int[] intArr = {1,2,3};
        Object oArr = intArr;
        // double[] dArr = (double[]) oArr; // ClassCastException

        Integer[] iObjArr = {1,2,3};
        Number[] nObjArr = iObjArr;
        // Double[] dObjArr = (Double[]) nObjArr; // ClassCastException


        Integer i = 10;
        Double d = 25.0;
        int j = 25;
        String s = "123";
        Number n = 123;
        n = 12.4;

        // byte < short < int < long < float < double
        //         char <

        System.out.println(i + d); // Unboxing (int, double) und primitive widening (double, double)
        System.out.println(d + j); // Unboxing und primitive widening
        System.out.println(d == j);

        // System.out.println(i == d); // Compiler Error
        // System.out.println(s == d); // Compiler Error
        System.out.println(n == d); // Erlaubt

        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);

        System.out.println();

        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 - i2); // - = kleiner, + = größer, 0 = gleich

        double d1 = 10.5;
        double d2 = 10.17;
        System.out.println((int)(d1 - d2)); // - = kleiner, + = größer, 0 = gleich

        System.out.println(Double.compare(d1, d2));

        i++; i = (int)(i + 1);

        System.out.println(10 + 'c');

    }
}
