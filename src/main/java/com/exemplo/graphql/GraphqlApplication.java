package com.exemplo.graphql;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exemplo.graphql.entities.Author;
import com.exemplo.graphql.entities.Book;
import com.exemplo.graphql.repositories.AuthorRepository;
import com.exemplo.graphql.repositories.BookRepository;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return agrs -> {
			Author josh = authorRepository.save(new Author("Josh"));
			Author mark = authorRepository.save(new Author("Mark"));
			
			bookRepository.saveAll(Arrays.asList(
					new Book("The Self-Taught Programmer mark 1", mark),
					new Book("The Self-Taught Programmer mark 2", mark),
					new Book("The Self-Taught Programmer josh 1", josh),
					new Book("The Self-Taught Programmer josh 2", josh),
					new Book("The Self-Taught Programmer josh 3", josh)
			));
		};
	}
}
