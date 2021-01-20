package com.hm.internal.ms.demo.greetingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Slf4j
public class GreetingServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreetingServiceApplication.class, args);
	}

	@GetMapping("/sayHello")
	public String greet() {
		log.info("Greeting service invoked");
		return "Hello There";
	}

}
