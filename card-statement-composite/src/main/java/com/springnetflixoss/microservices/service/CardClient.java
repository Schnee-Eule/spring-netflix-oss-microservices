package com.springnetflixoss.microservices.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "card-service")
public interface CardClient extends CardService {

}
