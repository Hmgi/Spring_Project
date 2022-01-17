package com.example.book.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("create")   // -> localhost:8080/create 접속하면 book/create.html 로 전달
    public String create(){
        return "book/create";
    }
}
