package de.gfn.basic.collections;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayTest {

    public static void main(String[] args) {

        List<String> zeichen = new ArrayList<>();
        zeichen.add("A");
        zeichen.add("B");
        zeichen.add("C");
        zeichen.add("D");

        Object[] arr1 = zeichen.toArray(); // Ist nicht generich. Liefert ein Object-Array

        String[] arr2 = new String[10];
        arr2 = zeichen.toArray(arr2);
        System.out.println(Arrays.toString(arr2));

        List<String> list = Arrays.asList(arr2);

        StringBuilder sb = new StringBuilder("Whizlab");
        char[] ch = new char[4];
        //sb.getChars(1,5, ch, 1); // hizl
        //for(char c : ch) System.out.print(c);

        System.out.println("|" + Arrays.toString(ch) + "|abc");

        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        System.out.println(Arrays.deepToString(arr));

        arr = new int[2][];
        //arr[0] = new int[3];
        // arr[0] = {1,2,3}; // Error: Array bereits deklariert
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[10];
        arr[0][0] = 1;
        System.out.println(Arrays.deepToString(arr));

        Integer i = Integer.valueOf("10"); // gleich Autoboxing. primitiv zu Wrapper
        i = Integer.decode("10");


    }

    private static <T> T machWas(int x, T input1, T input2) {
        return input1;
    }

    private static <T1, T2> T1 machWasAnders(int x, T1 input1, T2 input2) {
        return input1;
    }

}
