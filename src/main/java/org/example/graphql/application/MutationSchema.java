package org.example.graphql.application;

import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;
import graphql.schema.DataFetchingEnvironment;

import javax.validation.constraints.NotNull;

/**
 * Created by matheusferreira on 21/06/17.
 */
@GraphQLName("mutation")
public class MutationSchema {

	@GraphQLField
	public String user(final DataFetchingEnvironment env, @GraphQLName("id") Long id, @NotNull @GraphQLName("name") String name) {
		return null;
	}

	@GraphQLField
	public String deleteUser(final DataFetchingEnvironment env, @NotNull @GraphQLName("id") Long id) {
		return null;
	}

}
