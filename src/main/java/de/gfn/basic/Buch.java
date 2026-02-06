package de.gfn.basic;

import java.time.LocalDate;

public class Buch {

    private String titel;
    private String isbn;
    private String beschreibung;
    private String autor;
    private LocalDate erscheinungsDatum;
    private int seiten;
    private boolean verfuegbar;

    // Konstante Instanzattribute müssen spätestens im Konstruktor zugewiesen werden
    // Konstante Klassenattribute müssen spätestens beim laden der Klasse zugewiesen werden


    public Buch(String titel, String isbn, String beschreibung, String autor, LocalDate erscheinungsDatum, int seiten, boolean verfuegbar) {
        // Parameter und lokale Variablen überlagern gleichnamige Instanz- und Klassenattribute
        // Ist ein Attribut überlagert muss es über this, oder die Klasse angesprochen werden
        this.titel = titel;
        this.isbn = isbn;
        this.beschreibung = beschreibung;
        this.autor = autor;
        this.erscheinungsDatum = erscheinungsDatum;
        this.seiten = seiten;
        this.verfuegbar = verfuegbar;
    }

    public Buch(String titel, String isbn) {
        this(titel, isbn, "", "", LocalDate.now(), 0, false);
    }

    public Buch(String titel, String isbn, boolean verfuegbar) {
        this(titel, isbn, "", "", LocalDate.now(), 0, verfuegbar);
    }
}
