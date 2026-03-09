package de.gfn.basic.patterns.decorator;

public class LuxusFahrzeugDecorator extends FahrzeugDecorator {

    public LuxusFahrzeugDecorator(Fahrzeug fahrzeug) {
        super(fahrzeug);
    }

    @Override
    public void zusammenbauen() {
        super.zusammenbauen();
        System.out.println("Kühlschrank wird eingebaut");
        System.out.println("Weitere Luxusausstattung...");
    }
}