package com.example.book.repository;

import com.example.book.domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryBookRepositoryTest extends MemoryBookRepository {

    //사용할 레포지토리 생성
    MemoryBookRepository repository = new MemoryBookRepository();

    //ctrl + shift + t -> 테스트 케이스 생성

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("test1");
        book.setCategory("test 1");
        book.setPrice(10000);
        repository.save(book);

        Book book2 = new Book();
        book2.setName("test2");
        book2.setCategory("test 2");
        book2.setPrice(10000);
        repository.save(book2);

        List<Book> result = repository.findAll();

        int idx = 0;
        while(idx < result.size()){
            Book testBook = result.get(idx);
            System.out.println(testBook.getId() + " 번째 책 : " + testBook.getName() + " : 가격 : " + testBook.getPrice());
            idx++;
        }

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void testFindById() {
    }

    @Test
    void testFindByName() {
    }

    @Test
    void testFindByCategory() {
    }

    @Test
    void testFindByPrice() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void testClearStore() {
    }
}