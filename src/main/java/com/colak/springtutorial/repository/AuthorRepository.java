package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This repository uses EntityManager API to solve N+1 Select Problem
 */
@Repository
@RequiredArgsConstructor
public class AuthorRepository {

    private final EntityManager entityManager;

    public List<Author> findAll() {
        TypedQuery<Author> typedQuery = entityManager.createQuery("select a from Author a", Author.class);
        return typedQuery.getResultList();
    }

}
