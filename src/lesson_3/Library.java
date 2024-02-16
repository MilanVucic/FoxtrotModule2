package lesson_3;

import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Book> rentedBooks;
    private List<RegisteredUser> users;
    private List<BookTransaction> bookTransactions;

    // Adding methods for working with the library

    public void addBook(Book book) {
        books.add(book);
    }
}
