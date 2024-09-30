package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Author;
import com.colak.springtutorial.jpa.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository repository;

    @Test
    @Transactional
    void findByAll() {
        List<Author> list = repository.findAll();
        for (Author author : list) {
            for (Book book : author.getBooks()) {
                log.info("Author name : {} Book title : {} ", author.getName(), book.getTitle());
            }
        }
    }
}
