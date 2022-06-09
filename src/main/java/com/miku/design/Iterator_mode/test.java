package com.miku.design.Iterator_mode;

public class test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("asd"));
        bookShelf.addBook(new Book("asxxd"));
        bookShelf.addBook(new Book("azxcsd"));
        MyBookIterator iterator = bookShelf.getMyBookIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
