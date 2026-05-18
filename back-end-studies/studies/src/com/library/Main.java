package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Choose an action:" +
                    "\n1. Add book" +
                    "\n2. List books" +
                    "\n3. Search book" +
                    "\n4. Quit");
            char choice = sc.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Type the book's title:");
                    String title = sc.nextLine();
                    System.out.println("Type the book's author:");
                    String author = sc.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;
                case '2':
                    library.listBooks();
                    break;
                case '3':
                    if (library.isEmpty()) {
                        System.out.println("There are no books in the library");
                        break;
                    }

                    System.out.println("Enter the book's title:");
                    title = sc.nextLine();
                    library.searchBook(title);
                    break;
                case '4':
                    System.out.println("Always come back");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    continue;
            }
        }
    }
}
