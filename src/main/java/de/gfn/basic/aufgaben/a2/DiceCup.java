package de.gfn.basic.aufgaben.a2;

import java.util.Random;

public class DiceCup {

    private static final Random rand = new Random();

    private final Dice dice;

    public DiceCup() {
        dice = Dice.W6;
    }

    public DiceCup(Dice dice) {
        this.dice = dice;
    }

    public int roll() {
        return rand.nextInt(dice.getDots()) + 1;
    }

    public int[] roll(int count) {
        int[] results =  new int[count];
        for (int i = 0; i < count; i++) {
            results[i] = roll();
        }
        return results;
    }

    public void analyse(int[] results) {

        int[] counter = new int[dice.getDots()];
        for(int res : results) {
            counter[res - 1]++;
        }
        printAnalysis(counter);
    }

    private static void printAnalysis(int[] counter) {
        for(int i = 0; i < counter.length; i++) {
            System.out.println((i + 1) + ":" + counter[i]);
        }
    }
}
