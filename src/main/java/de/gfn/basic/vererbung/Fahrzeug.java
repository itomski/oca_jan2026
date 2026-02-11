package de.gfn.basic.vererbung;

// Eine Klasse mit mind. einer abstrakten Methode MUSS abstrakt sein
public abstract class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String modell;

    protected int kmh; // Nur diese Klasse und erbende Klassen dürfen auf dieses Attribut zugreifen

    public Fahrzeug() {
        System.out.println("K: Fahrzeug");
    }

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    // Methode ist nicht ausprogrammiert
    abstract void gibGas(int kmh);

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
}
