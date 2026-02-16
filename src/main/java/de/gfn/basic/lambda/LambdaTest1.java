package de.gfn.basic.lambda;

public class LambdaTest1 {

    public static void main(String[] args) {
        //(a, b) -> a.compareTo(b);

        int j = 10;

        Machbar m = new Machbar() { // Unbenannte Klasse implements Machbar wird instanziert

            @Override
            public void machWas(int i) {
                System.out.println("Test1: " + i + j);
            }
        };

        // j = 20; // nicht mehr effektiv final

        m.machWas(100);

        m = new Machbar() {

            @Override
            public void machWas(int i) {
                System.out.println("Test2: " + i);
            }
        };

        m.machWas(100);

        // Lokale Variablen, die in Lambdas genutzt werden müssen final oder effektiv final sein
        int i;
        i = 20;
        // Runnable r = () -> System.out.println(i);

        // Lambda ist die Iplementierung der einen einzigen abstrakten Methode verbunden mit einer Instanzierung
        // void machWas(int i)
        Machbar m2 = (e) -> System.out.println("Test3: " + e);
        m2.machWas(100);


    }
}

@FunctionalInterface
interface Machbar {

    void machWas(int i);

    // int machWasAnderes(int i);

}

/*
function xyz(a, b) {
}

xyz(10, 15);
 */