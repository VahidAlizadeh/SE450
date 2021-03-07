/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment1.solution.exercise3;

public class BookstoreTest {
    public static void main(String[] args) {

        Book se1 = new Book("978-0201633610", "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", 25, GenreUtils.SOFTWARE);
        Book se2 = new Book("978-0132350884", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 42, GenreUtils.SOFTWARE);
        Book scificV5 = new Book("978-1949102222", "The Best Science Fiction of the Year: Volume Five","The Best Science Fiction of the Year: Volume Five", 18, GenreUtils.SCIFI);
        Book houseThriller = new Book("978-0648225973", "The Housekeeper: A twisted psychological thriller", "Natalie Barelli",10, GenreUtils.THRILLER);
        Book girlRomance = new Book("978-1594634024", "The Girl on the Train","Paula Hawkins", 7, GenreUtils.ROMANCE);
        Book sapiens = new Book("978-0771038518", "Sapiens: A Brief History of Humankind","Yuval Noah Harari", 16, GenreUtils.ESSAY);

        Bookcase softwareBookcase = new Bookcase(GenreUtils.SOFTWARE);
        Bookcase scifiBookcase = new Bookcase(GenreUtils.SCIFI);
        Bookcase scifiBookcase2 = new Bookcase(GenreUtils.SCIFI);
        Bookcase thrillerBookcase = new Bookcase(GenreUtils.THRILLER);
        Bookcase romanceBookcase = new Bookcase(GenreUtils.ROMANCE);
        Bookcase essaysBookcase = new Bookcase(GenreUtils.ESSAY);
        Bookcase essaysBookcase2 = new Bookcase(GenreUtils.ESSAY);

        softwareBookcase.addBook(se1);
        softwareBookcase.addBook(se2);
        scifiBookcase.addBook(scificV5);
        thrillerBookcase.addBook(houseThriller);
        romanceBookcase.addBook(girlRomance);
        essaysBookcase.addBook(sapiens);

        Bookstore bookstore = Bookstore.getInstance();
        bookstore.setName("Bookstore for aliens");
        bookstore.addBookcase(softwareBookcase);
        bookstore.addBookcase(scifiBookcase);
        bookstore.addBookcase(scifiBookcase2);
        bookstore.addBookcase(thrillerBookcase);
        bookstore.addBookcase(romanceBookcase);
        bookstore.addBookcase(essaysBookcase);
        bookstore.addBookcase(essaysBookcase2);

        Bookcase[] bookcases = bookstore.getBookcases();
        System.out.println("Bookstore list of bookcases:");
        for (Bookcase bookcase : bookcases) {
            System.out.println("Bookcase " + bookcase.getGenre() + ":");
            Book[] books = bookcase.getBooks();
            for (Book book : books) {
                if (book != null) {
                    System.out.println("\t" + book.getTitle() + " by " + book.getAuthor() + " (Genre " + book.getGenre() + ")");
                }
            }
        }
    }
}