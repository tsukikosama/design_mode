package com.miku.design.Iterator_mode;

public class Book {
    private String bookName;
    public Book(String name){
        this.bookName = name;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
