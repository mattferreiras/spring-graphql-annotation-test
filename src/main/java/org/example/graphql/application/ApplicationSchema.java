package org.example.graphql.application;

import graphql.annotations.GraphQLAnnotations;
import graphql.schema.GraphQLSchema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static graphql.schema.GraphQLSchema.newSchema;

/**
 * Created by matheusferreira on 21/06/17.
 */
@Component
public class ApplicationSchema {

	private GraphQLSchema schema;

	@Autowired
	public ApplicationSchema() {
		schema = newSchema().query(GraphQLAnnotations.object(QuerySchema.class)).mutation(GraphQLAnnotations.object(MutationSchema.class)).build();
	}

	public GraphQLSchema getSchema() {
		return schema;
	}

}
