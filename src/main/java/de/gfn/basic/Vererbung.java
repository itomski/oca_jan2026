package de.gfn.basic;

public class Vererbung {

    public static void main(String[] args) {

    }

}

class Thing {

    public Thing(int i) {
        super();
    }
}

// NextThing ist von Thing abgeleitet dh. NextThing ist Child und Thing ist Parent
class NextThing extends Thing {

    public NextThing(int i) {
        super(i);
    }
}