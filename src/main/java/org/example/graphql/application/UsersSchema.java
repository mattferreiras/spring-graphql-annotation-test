package org.example.graphql.application;

import static graphql.schema.GraphQLSchema.newSchema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.annotations.GraphQLAnnotations;
import graphql.schema.GraphQLSchema;

/**
 * Created by matheusferreira on 21/06/17.
 */
@Component
public class UsersSchema {

	private GraphQLSchema schema;

	@Autowired
	public UsersSchema() {
		schema = newSchema().query(GraphQLAnnotations.object(UserQuery.class)).build();
	}

	public GraphQLSchema getSchema() {
		return schema;
	}

}
