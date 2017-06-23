package org.example.graphql.application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.ExecutionResult;
import graphql.GraphQL;

/**
 * Created by matheusferreira on 21/06/17.
 */
@Component
public class UserService {

	@Autowired
	private UsersSchema schema;

	private GraphQL graphQL;

	@PostConstruct
	private void init() {
		graphQL = new GraphQL(schema.getSchema());
	}

	@SuppressWarnings({ "unchecked" })
	public Object executeRequest(Map<String, Object> requestBody) {
		String query = (String) requestBody.get("query");
		String operationName = (String) requestBody.get("operationName");
		
		Map<String, Object> context = new HashMap<>();
		Map<String, Object> result = new LinkedHashMap<>();
		Map<String, Object> variables = (Map<String, Object>) requestBody.get("variables");

		ExecutionResult executionResult = graphQL.execute(query, operationName, context, variables);

		if (executionResult.getErrors().isEmpty()) {
			result.put("data", executionResult.getData());
		} else {
			result.put("errors", executionResult.getErrors());
		}

		return result;
	}

}
