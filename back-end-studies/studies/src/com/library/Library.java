package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books =  new ArrayList<Book>();

    void addBook(Book book) {
        books.add(book);
    }

    void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    void searchBook(String title) {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library");
        }

        boolean found = false;

            for (Book book : books) {
                if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    System.out.println(book);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Book " + "'" + title + "'" + " not found");
            }
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}
