package de.gfn.basic;

public class FluentTest {

    private final StringBuilder sb = new StringBuilder();

    public FluentTest add(String text) {
        sb.append(text);
        return this;
    }

    public String build() {
        return sb.toString();
    }

    public static void main(String[] args) {
        FluentTest test = new FluentTest();
        String s = test.add("Das ist ein Text...").add("...").add("ABC").build();
    }

}
