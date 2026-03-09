package de.gfn.basic.patterns.decorator;

public class SportFahrzeugDecorator extends FahrzeugDecorator {

    public SportFahrzeugDecorator(Fahrzeug fahrzeug) {
        super(fahrzeug);
    }

    @Override
    public void zusammenbauen() {
        super.zusammenbauen();
        System.out.println("Mehr Leistung wird eingebaut");
        System.out.println("Breitere Reifen werden nachgerüstet");
        System.out.println("Weitere Sportausstattung...");
    }
}
