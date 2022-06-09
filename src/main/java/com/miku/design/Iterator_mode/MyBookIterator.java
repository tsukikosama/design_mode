package com.miku.design.Iterator_mode;

import java.util.ArrayList;
import java.util.Iterator;

public class MyBookIterator implements BookIterator {
    private ArrayList<Book> list;
    private int max ;
    public int index = 0;
    public MyBookIterator(ArrayList<Book> book){
        this.list = book;
        this.max =book.size();
    }
    @Override
    public boolean hasNext(){
        return this.index < this.max;
    }

    @Override
    public Book next() {
        Book book = list.get(index);
        this.index++;
        return book;
    }


}
