package de.gfn.basic.streams;

public class Person {

    private String vorname;
    private String nachname;
    private String wohnort;

    public Person(String vorname, String nachname, String wohnort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.wohnort = wohnort;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getWohnort() {
        return wohnort;
    }

    @Override
    public String toString() {
//        final StringBuilder sb = new StringBuilder("Person{");
//        sb.append("vorname='").append(vorname).append('\'');
//        sb.append(", nachname='").append(nachname).append('\'');
//        sb.append(", wohnort='").append(wohnort).append('\'');
//        sb.append('}');
//        return sb.toString();

        final String TPL = "%s %s, %s";
        return String.format(TPL, vorname, nachname, wohnort);
    }
}
