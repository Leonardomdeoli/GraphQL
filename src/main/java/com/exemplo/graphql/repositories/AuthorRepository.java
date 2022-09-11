package com.exemplo.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.graphql.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
