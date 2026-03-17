package de.gfn.basic.annotations;

import lombok.NonNull;

import java.lang.annotation.Documented;

public class AnnoTest1 {

    @Override
    public String toString() {
        return "";
    }

    public void check(String s) {
    }
}

@FunctionalInterface
interface Abc {

    void run();

}
