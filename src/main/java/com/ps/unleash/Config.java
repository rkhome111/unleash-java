package com.ps.unleash;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import no.finn.unleash.DefaultUnleash;
import no.finn.unleash.Unleash;
import no.finn.unleash.util.UnleashConfig;

@Configuration
public class Config {
	
	@Bean
	public Unleash getUnleash() {
		
	UnleashConfig config = UnleashConfig.builder()
	        .appName("default")
//	        .instanceId("default")
//	        .environment("production")
	        .fetchTogglesInterval(1)
//	        .environment("development")
	        .unleashAPI("http://localhost:4242/api/")
	        .customHttpHeader("Authorization", "*:production.6cfb1e66665510af50d32119412b8962d59ad9f202a1141774d0c2f0")
	        .build();

	return new DefaultUnleash(config);
	}

}
