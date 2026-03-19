package de.gfn.basic;

public class EnumTest {

    public static void main(String[] args) {

        Color c = Color.GREEN;
        System.out.println(c);
        System.out.println(c.ordinal());

        c = Color.valueOf("BLACK");
        //c = Color.valueOf("BlaCK");

        String s1 = null;
        System.out.println(s1);
        //System.out.println(s1.toString());
        System.out.println(s1.format("%s...", "XYZ")); // Aufruf einer statischen Methode

        s1 = "ABCDEF";
        System.out.println(s1.charAt(s1.length()));

    }
}


enum Color {

    RED("FF0000"), GREEN("00FF00"), YELLOW("FFFF00"), BLACK("000000");

    private String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
