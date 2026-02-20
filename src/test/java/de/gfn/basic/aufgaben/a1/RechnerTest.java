package de.gfn.basic.aufgaben.a1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RechnerTest {

    @Test
    void add5And7() {
        double erg = Rechner.add(5, 7);
        //assertTrue(erg == 12);
        assertEquals(erg, 12);
    }

    @Test
    void sub() {
        double erg = Rechner.sub(5, 7);
        assertEquals(erg, -2);
    }

    @Test
    void div() {
        double erg = Rechner.div(10, 2);
        assertEquals(erg, 5);
    }

    @Test
    void divByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Rechner.div(10, 0);
        });
    }

    @Test
    void multi() {
        double erg = Rechner.multi(2, 10);
        assertEquals(erg, 20);
    }
}