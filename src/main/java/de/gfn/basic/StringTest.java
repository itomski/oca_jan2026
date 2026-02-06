package de.gfn.basic;

import java.util.Objects;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "ABC"; // Landet im String-Literal-Pool
        String s2 = "ABC"; // Verwendet das Objekt aus dem Pool
        String s3 = new String("ABC"); // Landet nicht im Pool

        System.out.println(s1 == s3); // Ist es das gleiche Objekt?
        s3 = s3.intern(); // String wird auf dem ein passendes Objekt im Pool umgeswitcht
        System.out.println(s1 == s3);

        System.out.println();

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2); // Gleiches Objekt?
        System.out.println(o1.equals(o2)); // Gleicher Inhalt?
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println();

        Fahrzeug f1 = new Fahrzeug("HH:AB123", "VW", "Polo");
        Fahrzeug f2 = new Fahrzeug("HH:AB123", "VW", "Polo");
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

        // Referenztyp: Objekt
        // Objekttyp: Fahrzeug (Heap)
        Object o = new Fahrzeug("HH:AB123", "VW", "Polo");

    }
}

class Fahrzeug {
    private String kennzeichen;
    private String marke;
    private String modell;

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(kennzeichen, fahrzeug.kennzeichen) && Objects.equals(marke, fahrzeug.marke) && Objects.equals(modell, fahrzeug.modell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kennzeichen, marke, modell);
    }

//    @Override
//    public String toString() {
//        return "Fahrzeug{" +
//                "kennzeichen='" + kennzeichen + '\'' +
//                ", marke='" + marke + '\'' +
//                ", modell='" + modell + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
