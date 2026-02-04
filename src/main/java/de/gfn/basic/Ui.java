package de.gfn.basic;

import java.util.Scanner;

public class Ui {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String QUESTION = "Wie ist dein Name?";
    private static final String TEMPLATE = "Dein Name ist %s \n";

    private static final String KEYS = "\n--------------------------------\n" +
                                        " q = Exit \n" +
                                        " n = Next \n" +
                                        "--------------------------------\n";

    public static void main(String[] args) {

        int i = 123;
        System.out.println(i);

        while(true) {
            System.out.println(QUESTION);
            String name = scanner.nextLine();
            System.out.printf(TEMPLATE, name);
            System.out.println(KEYS);
        }
    }
}
