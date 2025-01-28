package org.example.streams.tasks.task1;

import org.example.streams.provider.DataProvider;
import org.example.streams.domain.Book;

import java.util.List;

public class Main {

    private static final DataProvider PROVIDER = new DataProvider();

    public static void main(String[] args) {
        List<Book> books = PROVIDER.getBooks();
        //Тут код
    }




}
