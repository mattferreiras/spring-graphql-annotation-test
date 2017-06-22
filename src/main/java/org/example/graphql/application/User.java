package org.example.graphql.application;

import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;

@GraphQLName("user")
public class User {

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@GraphQLField
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
