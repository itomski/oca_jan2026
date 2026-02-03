package de.gfn.basic;

public class InstanzTest {

    private String text = "Moin"; // Instanzvariable
    private static String staticText = "Moin Moin"; // Klasssenvariable

    public static void main(String[] args) {

        System.out.println(staticText);
        printStaticText();

        InstanzTest test = new InstanzTest(); // Instanzierung
        System.out.println(test.text);
        test.printText();

        new InstanzTest().start();
    }

    private void start() {
        System.out.println(text);
        printText();
    }

    // Instanzmethode
    private void printText() {
        System.out.println(text);
    }

    // Klassenmethode
    private static void printStaticText() {
        System.out.println(staticText);
    }


}
