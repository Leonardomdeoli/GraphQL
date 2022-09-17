package com.exemplo.graphql.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor
public class Author {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	private Long ID;
	
	@NonNull
	private String name;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	
	public Author(@NonNull String name) {
		this.name = name;
	}
}
