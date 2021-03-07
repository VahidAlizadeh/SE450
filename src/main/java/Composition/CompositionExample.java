/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package Composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

    public static void main(String[] args)
    {

        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference","Herbert Schildt");

        // Creating the list which contains the no. of books.
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book> booksInLibrary = library.getTotalBooksInLibrary();
        for (Book myBook : booksInLibrary) {

            System.out.println("Title : " + myBook.title
                    + " and "
                    + " Author : " + myBook.author);
        }
    }
}
