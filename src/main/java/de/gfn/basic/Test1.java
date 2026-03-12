package de.gfn.basic;

public class Test1 {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        //i++, System.out.println(i);

//        for(;; i++, j++, System.out.println(i), System.out.println(j), j = getRand(), System.out.println(j)) {
//        }

        Test1 t1 = null;
        //System.out.println(t1.getNextRand());
        System.out.println(t1. getRand());

    }

    public static int getRand () {
        return 10;
    }

    public int getNextRand() {
        return 20;
    }

}
