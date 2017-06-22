package org.example.graphql.application;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;
import graphql.schema.DataFetchingEnvironment;

/**
 * Created by matheusferreira on 21/06/17.
 */
@GraphQLName("query")
public class QuerySchema {

	@GraphQLField
	public String user(final DataFetchingEnvironment env, @NotNull @GraphQLName("id") final Long id) {
		return null;
	}

	@GraphQLField
	public List<User> users(final DataFetchingEnvironment env) {
		List<User> users = new ArrayList<>();
		
		User u1 = new User();
		User u2 = new User();
		
		u1.setId(1L);
		u1.setName("U1");
		
		u2.setId(2L);
		u2.setName("U2");
		
		users.add(u1);
		users.add(u2);
		
		return users;
	}

}