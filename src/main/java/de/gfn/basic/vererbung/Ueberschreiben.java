package de.gfn.basic.vererbung;

public class Ueberschreiben {

    public static void main(String[] args) {

        CB1 cb1 = new CB2();
        Object i = cb1.machWas();

    }
}

class CB1 {

    protected Object machWas() {
        System.out.println("CB1: machWas");
        return 123;
    }
}

class CB2 extends CB1 {

    // ist der Rückgabetyp primitiv MUSS er beim Überschreiben gleich bleiben
    // Bei komplexen Datentypen darf der Rückgabetyp auch eine Kindklasse des ursprünglichen Typs sein

    @Override
    public String machWas() {
        System.out.println("CB2: machWas");
        return "...";
    }
}
