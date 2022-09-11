package com.exemplo.graphql.controllers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.exemplo.graphql.entities.Author;
import com.exemplo.graphql.repositories.AuthorRepository;

@Controller
public class AuthorController {
	
	private final AuthorRepository authorRepository;
	
	
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@SchemaMapping(typeName = "Query",value = "authors")
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
