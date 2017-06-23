package org.example.graphql.application;

import java.util.List;

import graphql.annotations.GraphQLDataFetcher;
import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;

/**
 * Created by matheusferreira on 21/06/17.
 */
@GraphQLName("Query")
public interface UserQuery {

	@GraphQLField
	@GraphQLDataFetcher(value = UserDataFetcher.class)
	public abstract List<User> users();
}
