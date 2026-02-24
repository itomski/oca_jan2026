package de.gfn.basic.kontrollstrukturen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ScopeTest {

    public static void main(String[] args) {

        int i = 10;
        //                 10 + 12 + 11 + 1
        System.out.println(i++ + ++i + --i + 1);

        i++;

        // System.out.println(10++);
        // 10 = (int)(10 + 1);


//        int i = 10;
//        {
//            int i = 20;
//            int j = 20;
//
//            {
//                int i = 30;
//                int j = 30;
//            }
//        }

        System.out.println();

        List<Integer> zahlen = List.of(1,5,7,8,19,22);
        Iterator<Integer> itr = zahlen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        zahlen.forEach(System.out::println);

        int[][] arr1 = new int[3][];
        int[][] arr2 = new int[3][2];
        String[][] arr3 = new String[3][2];
        Object[][] arr4 = new Object[3][2];
        Integer[][] arr5 = new Integer[3][2];

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        System.out.println(Arrays.deepToString(arr5));

        arr1[0][0] = 10;

        //Arrays.copyOf()

        



    }
}
