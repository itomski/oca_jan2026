package de.gfn.basic.aufgaben.a1;

public class Rechner {

    // privater Konstruktor verbietet die Instanzierung
    private Rechner() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double div(double a, double b) {
        double erg = a / b;
        if(Double.isInfinite(erg)) throw new ArithmeticException("Division by zero");
        return erg;
    }

    public static double multi(double a, double b) {
        return a * b;
    }
}
