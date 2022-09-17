package com.exemplo.graphql.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	private Long id;
	
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
}