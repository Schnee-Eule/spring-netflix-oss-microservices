package com.springnetflixoss.microservices.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springnetflixoss.microservices.model.CardVO;

public interface CardService {
	final static String PREFIX = "/api";
	
	@RequestMapping(value = PREFIX + "/cards", method = RequestMethod.GET)
	List<CardVO> getCards();
	
	@RequestMapping(value = PREFIX + "/card/{cardId}", method = RequestMethod.GET)
	CardVO getCard(@PathVariable Long cardId);
	
	@RequestMapping(value = PREFIX + "/new-card", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	void createCard(@RequestBody CardVO newCard);
}
