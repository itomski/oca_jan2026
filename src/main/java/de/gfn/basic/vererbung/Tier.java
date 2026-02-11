package de.gfn.basic.vererbung;

public class Tier {

    // Privates Inventar wird nicht vererbt
    private String name;
    private int alter;

    public Tier() {
        // super();
        System.out.println("C: Tier");
    }

    // package-private = Wird nur innerhalb des gleichen Package vererbt
    String getInfo() {
        return name + ", " +  alter;
    }

    // Nicht private Methoden werden vererbt
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
