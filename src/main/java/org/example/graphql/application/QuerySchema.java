package org.example.graphql.application;

import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;
import graphql.schema.DataFetchingEnvironment;

import javax.validation.constraints.NotNull;

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
	public String users(final DataFetchingEnvironment env) {
		return null;
	}

}
