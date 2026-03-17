package de.gfn.basic.annotations;


public class AnnoObj {

    private int zahl;

    @Test(run = false, title = "M1")
    public void machWas(int i) {
        System.out.println("Run: machWas -> " + i);
    }

    public void machWasAnderes(int i) {
        System.out.println("Run: machWasAnderes -> " + i);
    }

    @Test(title = "M2")
    public void machWasGanzAnderes(int i) {
        System.out.println("Run: machWasGanzAnderes -> " + i);
    }
}
