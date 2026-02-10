package de.gfn.basic.collections;

import java.util.Objects;

public class Fahrzeug implements Comparable<Fahrzeug> {

    private String kennzeichen;
    private String marke;
    private String modell;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    @Override
    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        sb.append(kennzeichen).append(", ").append(marke).append(", ").append(modell);
//        return sb.toString();

        return new StringBuilder()
                    .append(kennzeichen)
                    .append(", ")
                    .append(marke)
                    .append(", ")
                    .append(modell)
                    .toString();
    }

    @Override
    public int compareTo(Fahrzeug o) { // Natürlicheordnung
        //return kennzeichen.compareTo(o.kennzeichen);
        return modell.compareTo(o.modell);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(kennzeichen, fahrzeug.kennzeichen);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kennzeichen);
    }
}
