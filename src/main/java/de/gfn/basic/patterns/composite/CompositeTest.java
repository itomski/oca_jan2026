package de.gfn.basic.patterns.composite;

public class CompositeTest {

    public static final String BR = "--------";

    public static void main(String[] args) {

        Bewegbar b1 = new Kreis(10, 5, 20);
        System.out.println(b1);

        System.out.println();
        b1.bewegeNach(100, 100);
        System.out.println(b1);

        System.out.println(BR);

        b1 = new Rechteck(20, 50, 10, 7);
        System.out.println(b1);

        System.out.println();
        b1.bewegeNach(100, 100);
        System.out.println(b1);

        System.out.println(BR);

        FormGroup g1 = new FormGroup();
        Kreis k1 = new Kreis(10, 5, 20);
        Kreis k2 = new Kreis(25);
        Rechteck r1 = new Rechteck(2, 5, 10, 10);
        Rechteck r2 = new Rechteck(5, 5);

        FormGroup g2 = new FormGroup(k1, k2, r1, r2);
        // FormGroup g3 = new FormGroup(new Bewegbar[] {k1, k2, r1, r2}); // Auch als array möglich

        g1.add(b1);
        g2.add(g1);

        g2.bewegeNach(200, 200);

        System.out.println(g2);
    }
}
