package org.example.graphql.application;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by matheusferreira on 21/06/17.
 */
@Controller
@RequestMapping("/graphql")
public class GraphQlController {

	@Autowired
	private GraphQlExecutor graphQlExecutor;

	@PostMapping
	@ResponseBody
	public Object postGraphQl(@RequestBody Map<String, Object> requestBody) {
		return graphQlExecutor.executeRequest(requestBody);
	}

}
