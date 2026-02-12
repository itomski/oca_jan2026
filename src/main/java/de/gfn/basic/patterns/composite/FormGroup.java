package de.gfn.basic.patterns.composite;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormGroup implements Bewegbar {

    private final List<Bewegbar> elements;

    public FormGroup() {
        this.elements = new ArrayList<>();
    }

    public FormGroup(Bewegbar... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(Bewegbar... elements) {
        this.elements.addAll(Arrays.asList(elements));
    }

    public void bewegeNach(int x, int y) {
        for (Bewegbar element : elements) {
            element.bewegeNach(x, y);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormGroup{");
        sb.append("elements=").append(elements);
        sb.append('}');
        return sb.toString();
    }
}
