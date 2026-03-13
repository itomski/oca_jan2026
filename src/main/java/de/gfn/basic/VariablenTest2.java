package de.gfn.basic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariablenTest2 {

    public static void main(String[] args) {
        var i = 10;
        i += 2 + i++; // i = (int)(i + 2 + i++)
        System.out.println(i);

//        List<Integer> zahlen1 = new ArrayList<>();
//        var zahlen2 = new ArrayList<Integer>();

        String s = "Moin Moin";
        Object o = s; // Up Casting
        s = (String)o; // Down Casting

        int j;

        final boolean b = true; // Compiletime Konstante

//        final boolean b; // Runtime Konstante
//        b = true;

        if(b) j = 10;
        else j = 20;
        System.out.println(j);

        Double d1 = 10.2;
        Double d2 = 10.15;

        System.out.println(d2.getClass().isInstance(d1));

        Person p = new Person("Peter", "Parker", 32);
        for(Field f : p.getClass().getDeclaredFields()) {
            System.out.println(f.getType() + ": " + f);
        }

        StringBuilder sb = new StringBuilder();
        String s2 = "ABC";
        s2.indexOf("");

        System.out.println(String.join(", ", "Peter", "Bruce", "Carol"));

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(0,4);
        zahlen.set(0, 0);
        zahlen.replaceAll(e -> {
            if(e == 10) return 20;
            return e;
        });
        zahlen.remove((Integer)1);
        zahlen.remove(1);

        System.out.println();

        //int[] arr1, arr2[];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] aPart = arr[1];
        aPart[2] = 10;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(aPart));

        System.out.println(0b01101);
        System.out.println(053);
        System.out.println(0x15);

        System.out.println();

        int a[][] = new int[3][];// {0: null, 1: {1,2,3}, 2: {4,5}}
        a[1] = new int[]{1,2,3};
        a[2] = new int[]{4,5};

    }
}
