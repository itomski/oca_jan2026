package de.gfn.basic.vererbung;

public class Frosch extends Tier implements Movable  {

    @Override
    public void machWas() {
        System.out.println("Frosch macht was");
    }
}
