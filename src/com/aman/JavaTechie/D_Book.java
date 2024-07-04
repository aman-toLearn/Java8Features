package com.aman.JavaTechie;

import java.awt.*;

public class D_Book {

    private int id;
    private String name;
    private  int pages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "D_Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    public D_Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }
}
