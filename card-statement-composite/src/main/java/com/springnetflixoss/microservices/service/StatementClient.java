package com.springnetflixoss.microservices.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "statement-service")
public interface StatementClient extends StatementService {

}
