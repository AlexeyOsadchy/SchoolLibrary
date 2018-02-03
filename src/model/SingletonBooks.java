package model;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 03-Feb-18.
 */
public class SingletonBooks {

    private static final String BOOKS_FILE_NAME = "Books.txt";

    private static SingletonBooks sSingletonBooks;
    private List<Book> books;

    private SingletonBooks() {
        books = new ArrayList<>();
        initialization();
    }

    public static SingletonBooks getInstance() {
        if (sSingletonBooks == null) {
            sSingletonBooks = new SingletonBooks();
        }
        return sSingletonBooks;
    }

    public List<Book> getBooks() {
        return books;
    }

    private void initialization() {
        this.books = Utils.parseBook(Utils.read(BOOKS_FILE_NAME));
    }
}
