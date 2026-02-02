package de.gfn.basic.books;

public class Book {

    // Instanz und Klassenvariablen bekommen Standardwerte
    // int bekommt eine 0 als Standardwert
    // String bekommen eine null als Standardwert

    // Alle Objekte nutzen diese Klassen-Variable gemeinsam
    static int count;

    // Jedes Objekt hat eigene Instanzvariablen
    int id;

    String title;

    String description;

    String author;

    String isbn;

    // Konstruktor
    public Book() {
        id = ++count; // Vor der Zuweisung um 1 erhöhen
    }
}
