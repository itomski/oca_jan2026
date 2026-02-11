package de.gfn.basic.vererbung;

public class Pkw extends Fahrzeug {

    // Abstrakte Methoden der Elternklasse MÜSSEN in der Kindklasse eingebaut werden
    // anderenfalls muss die Kindklasse auch abstrakt sein

    // Abstrakte Klasse sind nicht fertig und können daher NICHT instanziert werden!!!!!


    public Pkw() {
        System.out.println("K: Pkw");
    }

    public Pkw(String kennzeichen, String marke, String modell) {
        super(kennzeichen, marke, modell); // Konstruktor der Elternklasse (auch bei abstrakten Klassen)
    }

    void gibGas(int kmh) {
        if(kmh > 0 && kmh < 250) {
            this.kmh = kmh;
        }
    }
}
