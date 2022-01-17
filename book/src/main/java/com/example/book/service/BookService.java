package com.example.book.service;

import com.example.book.domain.Book;
import com.example.book.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findBooks() {
        return bookRepository.findAll();
    }
}
