package com.ps.unleash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import no.finn.unleash.Unleash;
import no.finn.unleash.UnleashContext;

@RestController
public class TestController {
	
	@Autowired
	private Unleash unleash;

	@GetMapping("/")
	public Boolean getState() {
		
		UnleashContext context = UnleashContext.builder()
				  .userId("user@mail.com").remoteAddress("127.0.0.1").build();

		return unleash.isEnabled("test-toggle",context);
	}
	
	
}
