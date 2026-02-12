package de.gfn.basic.patterns.composite;

public class Kreis extends AbstractForm {

    private final int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    public Kreis(int x, int y, int radius) {
        this.radius = radius;
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
