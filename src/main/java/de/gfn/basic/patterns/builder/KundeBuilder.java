package de.gfn.basic.patterns.builder;

import java.time.LocalDate;

public class KundeBuilder {

    private String vorname = "Unbekannt";
    private String nachname = "Unbekannt";
    private LocalDate geburtsDatum;
    private KundenTyp typ = KundenTyp.TEST;

    // Sollte immer dabei sein!
    public KundeBuilder() {
    }

    // Weitere Konstruktoren
    public KundeBuilder(String vorname, String nachname, LocalDate geburtsDatum, KundenTyp typ) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.typ = typ;
    }

    public String getVorname() {
        return vorname;
    }

    public KundeBuilder setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public KundeBuilder setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public KundeBuilder setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
        return this;
    }

    public KundenTyp getTyp() {
        return typ;
    }

    public KundeBuilder setTyp(KundenTyp typ) {
        this.typ = typ;
        return this;
    }

    public Kunde build() {
        return new Kunde(vorname, nachname, geburtsDatum, typ);
    }
}
