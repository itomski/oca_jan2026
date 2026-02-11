package de.gfn.basic.vererbung;

import de.gfn.basic.collections.Person;

//
public class Vererbung1 /* extends Object steht automatisch drin */ {

    public static void main(String[] args) {

        // Referenztyp: Hund
        // Objekttyp: Hund
        Hund hund = new Hund();
        hund.rasse = "Fox Terrier";
        // hund.name = "Max"; // Error: Eigenschaft ist privat
        hund.setName("Max");
        //hund.alter = 5; // // Error: Eigenschaft ist privat
        hund.setAlter(5);
        System.out.println(hund.getInfo());

        System.out.println();

        // Referenztyp: Tier
        // Objekttyp: Hund
        Tier tier = new Hund(); // Hund IS-A Tier
        //tier.name = "Bob";
        tier.setName("Bob");
        //tier.alter = 3;
        tier.setAlter(3);
        System.out.println(tier.getInfo());

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        // Klassenmethoden werden auf dem Referenztyp ausgeführt

        Object o = new Hund(); // Hund IS-A Tier, Tier IS-A Object
        //Person p = new Hund(); // Error: Hund IS-NOT-A Person

        // Hund kann nicht in Person gecastet werden, da keine Erbbeziehung besteht
        // Person p = (Person)new Hund();

        Hund h2 = (Hund)o; // Möglich: Object und Hund sind durch eine Erbbeziehung verbunden
        //Person p2 = (Person)o; // ClassCastException zur Laufzeit

    }
}
