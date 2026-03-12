package de.gfn.basic;

public class ClassStarter {

    public static void main(String[] args) {
        System.out.println("Outer");
        Inner.main("ABC");

        InstanceInner i = new ClassStarter().new InstanceInner();
        i.main();
        ClassStarter.InstanceInner.main();

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.equals(sb));

        String s = "ABC";
        System.out.println(s.equals(s));

    }

    // Kann von Außen direkt angesprochen werden
    static class Inner {
        public static void main(String... args) {
            System.out.println("Inner");
        }
    }

    // Muss immer über ein Objekt der äußeren Klasse angesprochen werden
    class InstanceInner {
        public static void main(String... args) {
            System.out.println("IInner");
        }
    }
}
