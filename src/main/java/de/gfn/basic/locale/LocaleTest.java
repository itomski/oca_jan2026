package de.gfn.basic.locale;

import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {



        System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));

        //Locale.setDefault(Locale.US);
        //Locale.setDefault(Locale.FRENCH);

        System.out.println(Locale.getDefault());

        double preis = 1925.35;
        System.out.printf("%.2f", preis);

    }
}
