package org.example.graphql.application;

import java.util.ArrayList;
import java.util.List;

import graphql.annotations.GraphQLDataFetcher;
import graphql.annotations.GraphQLField;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.PropertyDataFetcher;

/**
 * Created by matheusferreira on 21/06/17.
 */
public class UserDataFetcher implements DataFetcher {

//	@GraphQLField
//	public String user(final DataFetchingEnvironment env, @NotNull @GraphQLName("id") final Long id) {
//		return null;
//	}
//
//	@GraphQLField
//	public List<User> users() {
//		List<User> users = new ArrayList<>();
//		
//		User u1 = new User();
//		User u2 = new User();
//		
//		u1.setId(1L);
//		u1.setName("U1");
//		
//		u2.setId(2L);
//		u2.setName("U2");
//		
//		users.add(u1);
//		users.add(u2);
//		
//		return users;
//	}

	@Override
	public List<User> get(DataFetchingEnvironment environment) {
	
		List<User> users = new ArrayList<>();
//		
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
	
	public static class User {
		@GraphQLField
		private Long id;
		@GraphQLField
		@GraphQLDataFetcher(value = PropertyDataFetcher.class, args = "name")
		private String name;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
	}

}