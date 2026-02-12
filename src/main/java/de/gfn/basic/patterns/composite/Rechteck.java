package de.gfn.basic.patterns.composite;

public class Rechteck extends AbstractForm {

    private int laenge;
    private int breite;

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(int laenge, int breite, int x, int y) {
        this(laenge, breite);
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rechteck{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(laenge);
        sb.append(", breite=").append(breite);
        sb.append('}');
        return sb.toString();
    }
}
