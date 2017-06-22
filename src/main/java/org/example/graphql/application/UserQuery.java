package org.example.graphql.application;

import java.util.List;

import org.example.graphql.application.UserDataFetcher.User;

import graphql.annotations.GraphQLDataFetcher;
import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;

@GraphQLName("Query")
public abstract class UserQuery {

	@GraphQLField
	@GraphQLDataFetcher(value = UserDataFetcher.class)
	public abstract List<User> users();


}
