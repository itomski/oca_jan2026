package de.gfn.basic.collections;

public class Fahrzeug {

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
}
