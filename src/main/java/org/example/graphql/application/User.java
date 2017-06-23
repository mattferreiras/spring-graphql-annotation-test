package org.example.graphql.application;

import graphql.annotations.GraphQLDataFetcher;
import graphql.annotations.GraphQLField;
import graphql.schema.PropertyDataFetcher;

/**
 * Created by matheusferreira on 23/06/17.
 */
public class User {

	@GraphQLField
	private Long id;

	@GraphQLField
	@GraphQLDataFetcher(value = PropertyDataFetcher.class, args = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
