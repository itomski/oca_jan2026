package de.gfn.basic.vererbung;

public interface Movable {

    // ist automatich public static final int x;
    int X = 100;

    // Instanz- und static Initializer im Inteface nicht erlaubt

    // Interfaces haben KEINE Konstruktoren

    // automatich: public abstract void machWas()
    void machWas();

    //void machWasGanzAnderes();

    // Es gibt KEINE abstrakten statischen Methoden

    // statische Methoden im Interface sind ausprogrammiert
    static void machWasAnderes() {
        System.out.println("machWasAnderes");
    }

    default void machIrgendwas() {
        System.out.println("machIrgendwas");
    }
}
