package de.gfn.basic.books;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book(); // Leeres Objekt
        book.title = "Neuromancer";
        book.author = "William Gibson";
        book.isbn = "1234-5678-90123";
        book.description = "This is a book...";
        //book.id = 1;

        Book b2 = new Book(); // Leeres Objekt
        b2.title = "Count Zero";
        b2.author = "William Gibson";
        b2.isbn = "5678-1234-90123";
        b2.description = "Other book";
        //b2.id = 2;

        final String TPL = "%d: %s, %s, %s, %s \n"; // Konstante

        System.out.println(book);
        System.out.printf(TPL, book.id, book.title, book.author, book.isbn, book.description);

        System.out.println(b2);
        System.out.printf(TPL, b2.id, b2.title, b2.author, b2.isbn, b2.description);

    }
}
