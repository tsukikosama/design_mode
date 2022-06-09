package com.miku.design.Iterator_mode;

import sun.nio.cs.Surrogate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf  {
    private ArrayList<Book> shelf = new ArrayList<>();
    public MyBookIterator getMyBookIterator(){
        return  new MyBookIterator(this.shelf);
    }
    public void addBook(Book book){
        shelf.add(book);
    }
    public void remove(){
        shelf.remove(0);
    }
}
