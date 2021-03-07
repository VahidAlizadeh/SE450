/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package Composition;

import java.util.List;

// Library class contains list of books.
class Library {

    // reference to refer to list of books.
    private final List<Book> books;

    Library(List<Book> books) { this.books = books; }

    // Getting total number of books
    public List<Book> getTotalBooksInLibrary()
    {

        return books;
    }
}