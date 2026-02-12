package de.gfn.basic.vererbung;

public class ExtendingInterfaces {
}

interface IA1 {

    void machA();

}

// extends bei einem Interface erlaubt nur Interfaces
interface IA2 extends IA1 {

    void machB();

}

// Es kann auch mehrere Interfaces extenden
interface IA3 extends IA1, IA2 {

    void machC();

}

// Muss alle abstrakten Mehthoden einbauen oder als abstrakt deklariert werden
class CC3 implements IA3 {

    @Override
    public void machC() {

    }

    @Override
    public void machB() {

    }

    @Override
    public void machA() {

    }
}