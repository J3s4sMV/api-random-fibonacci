package com.api.random.fibonacci.controllers;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.random.fibonacci.controllers.pojo.FibonacciResponse;
import com.api.random.fibonacci.controllers.pojo.Sequence;
import com.api.random.fibonacci.rest.FeignApiFibonacci;

@RestController
public class RandomSequenceController {
	
	@Autowired
	private FeignApiFibonacci feignApiFibonacci;
	
	@GetMapping(value = "/create/randon/sec/{limit}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FibonacciResponse> random(@PathVariable(value = "limit") int limit ) {
		Sequence sec=new Sequence();
		int random=new Random().nextInt(limit)+1;
		sec.setValue(random);
		System.out.println("···RANDOM SEQUENCE: "+random);
		return feignApiFibonacci.executeFibonacci(sec);
	}

}
