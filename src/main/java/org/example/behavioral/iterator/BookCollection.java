package org.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private ArrayList<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getSize() {
        return books.size();
    }

    public Iterator createIterator() {
        return new BookIterator(this);
    }
}
