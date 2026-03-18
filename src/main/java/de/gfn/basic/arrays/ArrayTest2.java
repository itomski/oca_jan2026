package de.gfn.basic.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ArrayTest2 {

    public static void main(String[] args) {

        printArray(new int[]{1,2,3}); // Ok
        // printArray({1,2,3}); // Error

        int[] arr = {1,2,3,4};
        Arrays.fill(arr, 5);
        arr = Arrays.copyOf(arr, 10);

        arr = new int[]{3,5,7,8};
        arr[0] = 10;

        // Arrays.asList(1,2,3,4,5); // Fixed Size

        double a = -10.0;
        double b = 7;
        double erg = a / b;
        if(!Double.isInfinite(erg) | !Double.isNaN(erg))
            System.out.println(erg);

        try {

        } catch (RuntimeException e) {
            // Kann immer gefangen werden
        }
//        catch (IOException e) {
//            // Kann nur gefangen werden, wenn im try ein Grund dafür besteht
//        }
        catch (Exception e) {
            // Kann immer gefangen werden
        }


    }

    private static void printArray(int[] ints) {

    }
}

@FunctionalInterface
interface Abc {

    void machWas();

    //String toString();

}