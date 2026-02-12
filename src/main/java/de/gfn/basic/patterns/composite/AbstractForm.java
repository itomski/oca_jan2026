package de.gfn.basic.patterns.composite;

public abstract class AbstractForm implements Bewegbar {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void bewegeNach(int x, int y) {
        setX(x);
        setY(y);
    }
}
