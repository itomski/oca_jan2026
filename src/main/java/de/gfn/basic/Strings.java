package de.gfn.basic;

public class Strings {

    public static void main(String[] args) {

        String str = "Moin";
        str = str + " Welt";
        str = str + "...";

        str = str.toUpperCase(); // in Großbuchstaben

        System.out.println(str);

        Student s = new Student("Peter", "Parker", 25);
        System.out.println(s);

        System.out.println(10 == 17); // bei primitiven Datentypen == ist ein Wertvergleich
        String a = "Moin";
        String b = "Moin"; // String Literal Pool
        String c = new String("Moin"); // Landet nicht im Pool
        System.out.println(a == b); // bei Objekten == ist ein Referenzvergleich (Ist es das gleiche Objekt auf dem Speicher?)
        System.out.println(a == c);

        System.out.println();

        System.out.println(a.equals(b)); // Vergleicht den Inhalt
        System.out.println(a.equals(c));

        System.out.println();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println();

        String str2 = 2 + 4 + "" + (7 + 5) * 8;

        str2 = str2.substring(1); // StringIndexOutOfBoundsException
        System.out.println(str2);

    }
}
