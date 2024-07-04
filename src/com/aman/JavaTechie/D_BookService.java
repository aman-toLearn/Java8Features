package com.aman.JavaTechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D_BookService {


    public List<D_Book> getBooksInSort(){
        List<D_Book> books = new D_DummyDAO().getBooks();
        Collections.sort(books, (o1,o2) -> o2.getName().compareTo(o1.getName())) ;
//            @Override
//            public int compare(D_Book o1, D_Book o2) {
//                       return o1.getName().compareTo(o2.getName());
//
//            }


        return  books;

    }

    public static void main(String[] args) {
        List<D_Book> booksInSort = new D_BookService().getBooksInSort();
        System.out.println(booksInSort);
    }
}

//class  MyComparator implements Comparator<D_Book>{
//    @Override
//    public int compare(D_Book o1, D_Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}

