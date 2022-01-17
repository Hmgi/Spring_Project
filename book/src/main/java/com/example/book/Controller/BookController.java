package com.example.book.Controller;

import com.example.book.domain.Book;
import com.example.book.repository.BookRepository;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/create")   // -> localhost:8080/create 접속하면 book/create.html 로 전달
    public String create(){
        return "book/create";
    }

    @GetMapping("/books")
    public String list(Model model){
        List<Book> books = bookService.findBooks();
        model.addAttribute("books", books);
        return "book/bookList";
    }
}
