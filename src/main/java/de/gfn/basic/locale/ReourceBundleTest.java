package de.gfn.basic.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ReourceBundleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Locale.setDefault(Locale.UK);

        ResourceBundle bundle = ResourceBundle.getBundle("lang.ui");

        System.out.println(bundle.getString("greeting"));

        System.out.println(bundle.getString("question"));
        int eingabe = scanner.nextInt();

        System.out.println(bundle.getString("answer") + " " + eingabe);
    }
}
