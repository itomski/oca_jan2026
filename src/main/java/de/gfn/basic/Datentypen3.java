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
        Byte b5 = 10; // komplex
        //Short s = (Short)b5;

    }
}
