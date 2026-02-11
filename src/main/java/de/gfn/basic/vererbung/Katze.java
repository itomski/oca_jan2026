package de.gfn.basic.vererbung;

public class Katze implements Movable {
    @Override
    public void machWas() {
        int i = 10;
        i++;
        System.out.println("Die Katze macht was " + i + " mal");
    }
}
