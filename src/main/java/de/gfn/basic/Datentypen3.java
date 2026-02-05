package de.gfn.basic;

public class Datentypen3 {

    public static void main(String[] args) {

        int zahl = 3 + (int)10.2 + 100;

        byte b = 10;
        b++; // b = (byte)(b + 1);
        b = 125;
        b++;
        b++;
        b++; // Kann zum Über- / Unterlauf führen
        System.out.println(b);

        // Kann zum Über- / Unterlauf führen
        b += 7; // b = (byte)(b + 7);

        System.out.println();

        // +=, -=, *=, /=, %=

        byte b2 = 10; // 00001010
        byte b3 = 22; // 00010110
        System.out.println(b2 & b3); // 00000010
        System.out.println(b2 | b3); // 00011110
        System.out.println(b2 ^ b3); // 00011100

        System.out.println();

        byte b4 = 10; // primitiv
        Byte b5 = 10; // komplex, Autoboxing byte auf Byte
        b4 = b5; // Auto-Unboxing von Byte auf byte

        //Integer i1 = b4; // Auoboxing von byte auf Byte, Byte ist zu Integer nicht kompatibel
        Number n = b4; // Auoboxing von byte auf Byte, komplex Widening von Byte auf Number

        System.out.println();

        // Byte-Literal-Pool: Bei allen Ganzzahlen (-128 - 127)
        Integer b7 = 121;
        Integer b8 = 121;
        Integer b9 = Integer.valueOf(121);
        System.out.println(b7 == b8); // Komplexe Datentypen == ist ein Referenzvergleich
        System.out.println(b7 == b9);
        System.out.println(b7.equals(b8)); // equals ist ein Wertvergleich
        System.out.println(b7.equals(b9)); // equals ist ein Wertvergleich
    }
}
