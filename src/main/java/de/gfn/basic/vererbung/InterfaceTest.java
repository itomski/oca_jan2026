package de.gfn.basic.vererbung;

public class InterfaceTest {

    public static void main(String[] args) {

        Pferd p = new Pferd();
        execute(p);

        Katze k = new Katze();
        execute(k);

        Frosch f = new Frosch();
        execute(f);

    }

    private static void execute(Movable m) {
        m.machWas();
    }

//    private static void execute(Katze k) {
//        k.machWas();
//    }

}
