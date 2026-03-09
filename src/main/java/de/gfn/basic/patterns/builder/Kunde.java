package de.gfn.basic.patterns.builder;

import java.time.LocalDate;

public class Kunde {

    private final String vorname;
    private final String nachname;
    private final LocalDate geburtsDatum;
    private final KundenTyp typ;

    public Kunde(String vorname, String nachname, LocalDate geburtsDatum, KundenTyp typ) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.typ = typ;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public KundenTyp getTyp() {
        return typ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append(", typ=").append(typ);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {

        private String vorname = "Unbekannt";
        private String nachname = "Unbekannt";
        private LocalDate geburtsDatum;
        private KundenTyp typ = KundenTyp.TEST;

        // Sollte immer dabei sein!
        public Builder() {
        }

        // Weitere Konstruktoren
        public Builder(String vorname, String nachname, LocalDate geburtsDatum, KundenTyp typ) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.geburtsDatum = geburtsDatum;
            this.typ = typ;
        }

        public String getVorname() {
            return vorname;
        }

        public Builder setVorname(String vorname) {
            this.vorname = vorname;
            return this;
        }

        public String getNachname() {
            return nachname;
        }

        public Builder setNachname(String nachname) {
            this.nachname = nachname;
            return this;
        }

        public LocalDate getGeburtsDatum() {
            return geburtsDatum;
        }

        public Builder setGeburtsDatum(LocalDate geburtsDatum) {
            this.geburtsDatum = geburtsDatum;
            return this;
        }

        public KundenTyp getTyp() {
            return typ;
        }

        public Builder setTyp(KundenTyp typ) {
            this.typ = typ;
            return this;
        }

        public Kunde build() {
            return new Kunde(vorname, nachname, geburtsDatum, typ);
        }
    }
}
