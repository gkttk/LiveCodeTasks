package org.example.streams.provider;

import org.example.streams.domain.Author;
import org.example.streams.domain.Book;
import org.example.streams.domain.Genre;
import org.example.streams.domain.Material;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataProvider {

    public List<Book> getBooks() {
        return Arrays.asList(
                new Book(
                        "Yes Please",
                        List.of(
                                new Author("Amy", "Poehler", 35),
                                new Author("Terry", "Pratchett", 54)
                        ),
                        List.of(Genre.COMEDY, Genre.NOVEL),
                        329,
                        BigDecimal.valueOf(1500),
                        LocalDateTime.of(2014, Month.OCTOBER, 14, 0, 0),
                        Material.PAPER
                ),
                new Book(
                        "Me Talk Pretty One Day",
                        Collections.singletonList(
                                new Author("Terry", "Pratchett", 54)
                        ),
                        List.of(Genre.HORROR, Genre.NOVEL),
                        272,
                        BigDecimal.valueOf(1200),
                        LocalDateTime.of(2000, Month.JANUARY, 1, 0, 0),
                        Material.CARTON
                ),
                new Book(
                        "The Princess Bride",
                        Collections.singletonList(
                                new Author("Amy", "Poehler", 35)
                        ),
                        List.of(Genre.HORROR),
                        429,
                        BigDecimal.valueOf(1540),
                        LocalDateTime.of(1973, Month.SEPTEMBER, 1, 0, 0),
                        Material.FABRIC
                ),
                new Book(
                        "Catch-22",
                        Collections.singletonList(
                                new Author("Joseph", "Heller", 26)
                        ),
                        List.of(Genre.CLASSICS, Genre.WAR, Genre.NOVEL),
                        453,
                        BigDecimal.valueOf(2200),
                        LocalDateTime.of(1961, Month.NOVEMBER, 10, 0, 0),
                        Material.PAPER
                ),
                new Book(
                        "I Am America",
                        Collections.singletonList(
                                new Author("Stephen", "Coldbert", 55)
                        ),
                        List.of(Genre.COMEDY, Genre.WAR),
                        230,
                        BigDecimal.valueOf(800),
                        LocalDateTime.of(2007, Month.OCTOBER, 9, 0, 0),
                        Material.FABRIC
                )
        );
    }

}
