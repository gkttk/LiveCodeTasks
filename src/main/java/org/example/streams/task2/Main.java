package org.example.streams.task2;

import org.example.streams.task2.domain.Book;
import org.example.streams.task2.provider.DataProvider;

import java.util.List;

public class Main {

    private final static DataProvider PROVIDER = new DataProvider();

    public static void main(String[] args) {
        List<Book> books = PROVIDER.getBooks();
        //Код тут
    }
}