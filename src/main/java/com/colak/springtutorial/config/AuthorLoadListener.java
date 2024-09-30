package com.colak.springtutorial.config;

import com.colak.springtutorial.jpa.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.springframework.stereotype.Component;

@Component
public class AuthorLoadListener implements PostLoadEventListener {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void onPostLoad(PostLoadEvent event) {
        Object entity = event.getEntity();

        // Prefetch related items for Order entities
        if (entity instanceof Author author) {
            // Use a batch fetch query to load all items for this order
            author.getBooks().size(); // Forces initialization of the lazy-loaded collection
        }
    }
}
