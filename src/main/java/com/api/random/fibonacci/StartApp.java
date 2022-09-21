package com.api.random.fibonacci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.api.random.fibonacci")
@SpringBootApplication
@EnableFeignClients
public class StartApp {

	public static void main(String[] args) {
		SpringApplication.run(StartApp.class);

	}

}
