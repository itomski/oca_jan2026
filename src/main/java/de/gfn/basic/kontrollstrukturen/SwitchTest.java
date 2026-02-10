package de.gfn.basic.kontrollstrukturen;

public class SwitchTest {

    public static void main(String[] args) {

        // erlaubt: byte, short, char, int
        // String
        // Enum

        byte input = 3;
        //long input = 3;
        // char input = 3;

        switch (input) {
            case 1:
                int i = 10;
                System.out.println(". " + i);
                break;

            case 2:
                i = 20;
                System.out.println(".. " + i);
                break;

            case 3:
                i = 30;
                System.out.println("... " + i);
                break;

//            case 250:
//                i = 50;
//                System.out.println("..... " + i);
//                break;

            default:
                i = 40;
                System.out.println("---- " + i);
        }

        System.out.println();

        String s = "Moin";

        final String s1 = "M"; // Kompiletimekonstante
        final String s2 = "H";
        final String s3 = "X";
        final String s4;
        s4 = "B"; // Runtimekonstante

        switch (s) {
            // Muss eine Kompiletimekonstante sein
            case s1 + "oin":
                System.out.println("....");

            case s2 + "oin":
                System.out.println("..");

            case s3 + "oin":
                System.out.println("......");

//            case s4 + "oin": // Error
//                System.out.println("......");
        }

        System.out.println();

        Wochentag tag = Wochentag.DI;

        switch (tag) {
            case DI -> methodA(); // Bei verwendung von -> ist ein break automatisch gesetzt
            case MI -> methodB();
            case SO -> methodC();
            default -> {
                System.out.println("Leer");
            }
        }

        System.out.println();

        switch (tag) {
            case MO:
            case DI:
            case MI:
            case DO:
            case FR:
                System.out.println("Arbeit");
            case SA:
            case SO:
                System.out.println("Wochenende");
        }

        System.out.println();

        // Ab Java 14
        String str = switch(tag) {
            case MO, DI, MI, DO, FR -> "Arbeit";
            case SA, SO -> "Wochenende";
        };
    }

    private static  void methodA() {
        System.out.println("A");
    }

    private static  void methodB() {
        System.out.println("B");
    }

    private static  void methodC() {
        System.out.println("C");
    }
}
