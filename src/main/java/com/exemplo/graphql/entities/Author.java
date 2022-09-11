package com.exemplo.graphql.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Author {
	@Id
	@GeneratedValue
	private Long ID;
	
	@NonNull
	private String name;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	
	public Author() {
	}

	public Author(@NonNull String name) {
		this.name = name;
	}
}
