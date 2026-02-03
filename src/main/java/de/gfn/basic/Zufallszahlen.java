package de.gfn.basic;

import java.util.Random;

public class Zufallszahlen {

    private static final Random RAND = new Random();

    public static void main(String[] args) {

        System.out.println((int)(Math.random() * 6) + 1);

        System.out.println(RAND.nextInt());
        System.out.println(RAND.nextInt(6) + 1);
        System.out.println(RAND.nextInt(1,7));


    }
}
