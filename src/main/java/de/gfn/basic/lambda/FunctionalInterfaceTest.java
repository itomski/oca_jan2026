package de.gfn.basic.lambda;

public class FunctionalInterfaceTest {

    public static void main(String[] args) throws InterruptedException {

        // double execute(double a, double b);
        MathOperation add = (a, b) -> a + b;
        MathOperation multi = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mod = (a, b) -> a % b;

        System.out.println(add.execute(10, 15));
        System.out.println(multi.execute(10, 15));
        System.out.println(div.execute(10, 15));
        System.out.println(sub.execute(10, 15));

        System.out.println(sub.hashCode());
        // sub.wait(100); // IllegalMonitorStateException

        // Object o = a -> a * a; // Error


    }
}

@FunctionalInterface
interface MathOperation {

    double execute(double a, double b);

    @Override
    int hashCode(); // hashCode, equals, toString, wait, notify und notifyAll
}
