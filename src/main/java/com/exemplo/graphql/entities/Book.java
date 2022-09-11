package com.exemplo.graphql.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	public Book() {
	}

	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
}
