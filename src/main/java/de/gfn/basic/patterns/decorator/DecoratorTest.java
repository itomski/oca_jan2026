package de.gfn.basic.patterns.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DecoratorTest {

    public static void main(String[] args) throws IOException {

        Fahrzeug f = new BasisFahrzeug();
        f.zusammenbauen();

        System.out.println();

        //f = new SportFahrzeugDecorator(f);
        f = new LuxusFahrzeugDecorator(f);
        f.zusammenbauen();


        // LowLevelStream
        FileInputStream fis = new FileInputStream("...");
        // HighLevelStream
        ObjectInputStream ois = new ObjectInputStream(fis);

    }
}
