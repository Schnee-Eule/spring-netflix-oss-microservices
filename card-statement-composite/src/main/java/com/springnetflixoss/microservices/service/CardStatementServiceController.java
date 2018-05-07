package com.springnetflixoss.microservices.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springnetflixoss.microservices.model.CardVO;
import com.springnetflixoss.microservices.model.StatementVO;

@RestController
@RequestMapping(name="/api")
public class CardStatementServiceController {

	@Autowired
	CardClient cardClient;
	
	@Autowired
	StatementClient statementClient;
	
	@RequestMapping(value = "/statement-by-card", method = RequestMethod.GET)
	public ResponseEntity<Map<CardVO, List<StatementVO>>> getStatementbyCardId(@RequestParam Long cardId) {
		Map<CardVO, List<StatementVO>> response = new HashMap<>();
//		response.put(cardClient.getCard(cardId), statementClient.getStatements(cardId));
		response.put(new CardVO(), Arrays.asList(new StatementVO()));
		
		return new ResponseEntity<Map<CardVO,List<StatementVO>>>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/foo", method = RequestMethod.GET)
	public String getFoo() {
		return "Foo";
	}
}
