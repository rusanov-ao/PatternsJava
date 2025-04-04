package org.example.behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book("1984"));
        bookCollection.addBook(new Book("Brave New World"));
        bookCollection.addBook(new Book("Fahrenheit 451"));

        Iterator iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
