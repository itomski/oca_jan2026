package de.gfn.basic;

public class SBTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(50);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println();

        sb.append("12345678").append(910111213);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println();

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println();

        sb.setLength(150);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println();
    }
}
