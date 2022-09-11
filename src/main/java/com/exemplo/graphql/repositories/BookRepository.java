package com.exemplo.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.graphql.entities.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

}
