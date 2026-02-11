package de.gfn.basic.arrays;

import de.gfn.basic.Student;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] zahlen = {2,3,4,5,6,7,8};
        String[] namen = {"Peter", "Natasha", "Bruce", "Carol", "Steve"};
        Student[] students;
        students = new Student[10];
        //Student[] students = new Student[]{};
        System.out.println(Arrays.toString(students));
        students[0] = new Student("Peter", "Parker", 25);

        System.out.println(zahlen.length);
        System.out.println(Arrays.toString(zahlen));

        System.out.println();

        for(int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        System.out.println();

        for(int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        for(String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        Arrays.stream(zahlen)
                .forEach(w -> System.out.println(w));

        System.out.println();
        //zahlen[10] = 20; // schreiben: ArrayIndexOutOfBoundsException
        zahlen[6] = 100;
        System.out.println(Arrays.toString(zahlen));

        //zahlen = new int[-10]; // NegativeArraySizeException

        zahlen = new int[]{2,6,8}; // Mit Wertvorgabe

        int[] zahlen2 = {2,6,8}; // Nur bei gleichzeitiger Deklaration der Variable erlaubt
        zahlen2 = new int[]{3,7,9}; // Bei bereits deklarierter Variable

        int[] a, b, c; // 3 int Arrays
        int d, e, f[]; // 2 int Variablen und 1 int Array

        int[] x[]; // 2d Array

        Object o = 10; // Autoboxing von int in Integer
        o = "Moin";
        o = 100L; // Autoboxing von long auf Long
        o = new Student("Bruce", "Banner", 42);
    }
}
