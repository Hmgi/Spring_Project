package com.example.book;

import com.example.book.repository.BookRepository;
import com.example.book.repository.MemoryBookRepository;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    @Bean
    public BookService bookService() {
        return new BookService(bookRepository());
    }

    @Bean
    public BookRepository bookRepository(){
        return new MemoryBookRepository();
    }
}
