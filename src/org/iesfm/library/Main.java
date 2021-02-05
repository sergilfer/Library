package org.iesfm.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Book book = readBook();
        book.info();
    }

    static Book readBook() {
        Book book = null;
        while (book == null) {
            String title = scan.nextLine();
            String author = scan.nextLine();
            int isbn = readISBN();
            String[] genres = new String[1];
            genres[0] = "Terror";
            book = new Book(isbn, title, author, genres);
        }
        return book;
    }

    static int readISBN() {
        Integer isbn = null;
        System.out.println("Introduce el ISBN");
        while (isbn == null) {
            try {
                isbn = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("El ISBN debe ser un número");
            }
        }
        return isbn;
    }


}
