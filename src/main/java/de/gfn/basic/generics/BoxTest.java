package de.gfn.basic.generics;

import de.gfn.basic.Buch;

public class BoxTest {

    public static void main(String[] args) {

        StringBox b1 = new StringBox("ABC");
        System.out.println(b1.getContent());

        IntegerBox b2 = new IntegerBox(100);
        System.out.println(b2.getContent());

        Box<String> strBox = new Box<>("Hallo");
        System.out.println(strBox.getContent());

        Box<Integer> intBox = new Box<>(200);
        System.out.println(intBox.getContent());

        Box<Buch>  buchBox = new Box<>(new Buch("Abc", "12345"));
        System.out.println(buchBox.getContent());

    }
}

class StringBox {
    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class IntegerBox {

    private Integer content;

    public IntegerBox(Integer content) {
        this.content = content;
    }

    public Integer getContent() {
        return content;
    }
}

class Box<T> { // Hier wird der Platzhalter vorgestellt

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}


