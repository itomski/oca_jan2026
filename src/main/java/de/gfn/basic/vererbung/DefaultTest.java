package de.gfn.basic.vererbung;

import java.util.ArrayList;
import java.util.List;

public class DefaultTest {

    public static void main(String[] args) {


    }
}


interface Ia {

    void machWas();

    default void machWasAnderes() {
        System.out.println("Ia");
    }
}

interface Ib {

    void machWas();

    default void machWasAnderes() {
        System.out.println("Ib");
    }
}

class Cb implements Ia, Ib {

    @Override
    public void machWas() {

    }

    @Override
    public void machWasAnderes() {
        // Konflikt kann nur durch einbauen einer eignen Methoder gelöst werden
    }
}