package com.api.random.fibonacci.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.random.fibonacci.controllers.pojo.FibonacciResponse;
import com.api.random.fibonacci.controllers.pojo.Sequence;

@FeignClient(value = "Api-Fibonacci", url = "${feign.client.config.api-fibonacci.base-url}")
public interface FeignApiFibonacci {

	@PostMapping(value = "/sec", consumes = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<FibonacciResponse> executeFibonacci(@RequestBody Sequence sec);

}
