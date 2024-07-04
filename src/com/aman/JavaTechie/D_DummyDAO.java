package com.aman.JavaTechie;

import java.util.ArrayList;
import java.util.List;

public class D_DummyDAO {

    public List<D_Book> getBooks(){

        List<D_Book> books = new ArrayList<>();

        books.add(new D_Book( 101,"Core Java", 400));
        books.add(new D_Book( 102,"AD Java", 500));
        books.add(new D_Book( 104,"Java", 700));

        return books;


    }
}
