package com.example.book.repository;

import com.example.book.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Book save(Book book);

    Optional<Book> findById(Long id);
    Optional<Book> findByName(String name);
    Optional<Book> findByCategory(String category);
    //Optional<Book> findByPrice(int price);

    List<Book> findAll();
}
