package de.gfn.basic.aufgaben.a2;

public enum Dice {

    W4(4), W6(6), W10(10), W20(20), W100(100);

    private final int dots;

    Dice(int dots) {
        this.dots = dots;
    }

    public int getDots() {
        return dots;
    }
}
