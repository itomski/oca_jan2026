package de.gfn.basic;

import java.math.BigInteger;

public class Tag0311 {
    public static void main(String[] args) {
        System.out.println(fibERec(100000));
        //System.out.println(fibAcc( 20000));
    }

    public static long fibAcc(int n) {
        return fibAcc(n, 0, 1);
    }

    private static long fibAcc(int n, long a, long b) {
        if (n == 0) return a;
        return fibAcc(n - 1, b, a + b);
    }

    public static BigInteger fibERec(int n) {
        return fibERec(n, BigInteger.ZERO, BigInteger.ONE);
    }

    private static BigInteger fibERec(int n, BigInteger a, BigInteger b) {
        while(true) {
            if (n == 0) return a;
            n = n - 1;
            BigInteger a_alt = a;
            a = b;
            b = a_alt.add(b);
        }
    }
}
