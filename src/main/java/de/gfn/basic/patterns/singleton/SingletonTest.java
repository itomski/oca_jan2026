package de.gfn.basic.patterns.singleton;

public class SingletonTest {

    private static EnumSingleton es;

    public static void main(String[] args) {

//        Enum
//        es = EnumSingleton.INSTANCE;
//        es.setZahl(10);
//        System.out.println(es.getZahl());
//        machWas();

        EagerSingleton es = EagerSingleton.getInstance();
        es.setZahl(100);
        System.out.println(es.getZahl());
        machWas();
        System.out.println(es.getZahl());

    }

    private static void machWas() {
//        System.out.println(EnumSingleton.INSTANCE == es);
//        System.out.println(EnumSingleton.INSTANCE.getZahl());

        System.out.println(EagerSingleton.getInstance().getZahl());
        EagerSingleton.getInstance().setZahl(500);
        EagerSingleton x = EagerSingleton.getInstance();
        System.out.println(x.getZahl());
    }
}
