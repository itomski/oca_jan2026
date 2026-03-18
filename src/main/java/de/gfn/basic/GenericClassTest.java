package de.gfn.basic;

public class GenericClassTest {

    public static void main(String[] args) {

        System.out.println(10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % 3);
        System.out.println(-10 % -3);

    }
}

class GenericBox<T> {

    String s = "ABC";

}
