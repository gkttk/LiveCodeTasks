package org.example.streams.task2.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Book(String title, List<Author> authors, List<Genre> genres, int pagesNumber, BigDecimal price,
                   LocalDateTime releaseDate, Material material) {

    @Override
    public String toString() {
        return title;
    }
}