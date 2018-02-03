package model;

/**
 * Created by Алексей on 03-Feb-18.
 */
public class Book {

    private int bookId;
    private String nameOfBook;

    public Book(int id, String name) {
        this.bookId = id;
        this.nameOfBook = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
}
