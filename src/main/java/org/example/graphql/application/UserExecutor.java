package org.example.graphql.application;

import graphql.ExecutionResult;
import graphql.GraphQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by matheusferreira on 21/06/17.
 */
@Component
public class UserExecutor {

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
		Map<String, Object> variables = (Map<String, Object>) requestBody.get("variables");
		Map<String, Object> context = new HashMap<>();

		ExecutionResult executionResult = graphQL.execute(query, operationName, context, variables);
		Map<String, Object> result = new LinkedHashMap<>();

		if (executionResult.getErrors().isEmpty()) {
			result.put("data", executionResult.getData());
		} else {
			result.put("errors", executionResult.getErrors());
		}

		return result;
	}

}
