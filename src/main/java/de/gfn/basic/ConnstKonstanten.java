package de.gfn.basic;

public class ConnstKonstanten {

    public static void main(String[] args) {

    }
}

class Parent {

    private final int zahl;

    public Parent(int zahl) {
        this.zahl = zahl;
    }

}

class Child extends Parent {

    public Child(int zahl) {
        super(zahl);
    }
}
