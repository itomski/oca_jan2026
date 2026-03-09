package de.gfn.basic.patterns.builder;

import java.util.Locale;

public class BuilderTest1 {

    public static void main(String[] args) {

        // StringBuilder ist kein String
        StringBuilder sb = new StringBuilder("Das ist das Haus");
        sb.append("...");
        String s = sb.toString(); // Build-Methode
        sb.append(" Das ist ja toll...");
        sb.append("123").append("xyz");
        s = sb.toString();

        System.out.println();

        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("de").setRegion("DE");
        Locale loc = builder.build(); // Erzeugt aus dem aktuellen Zustand des Builders ein Locale Objekt
        System.out.println(loc);

        builder.setLanguage("fr");
        loc = builder.build();
        System.out.println(loc);

    }
}
