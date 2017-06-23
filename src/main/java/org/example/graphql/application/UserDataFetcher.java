package org.example.graphql.application;

import java.util.ArrayList;
import java.util.List;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * Created by matheusferreira on 21/06/17.
 */
public class UserDataFetcher implements DataFetcher {

	@Override
	public List<User> get(DataFetchingEnvironment environment) {
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