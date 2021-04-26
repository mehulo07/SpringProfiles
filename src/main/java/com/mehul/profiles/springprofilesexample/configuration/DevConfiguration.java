package com.mehul.profiles.springprofilesexample.configuration;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!dev")//It will runs on all profiles except dev
//@Profile("dev")//It will runs only on Dev environment
public class DevConfiguration {
	
	@PostConstruct
	public void DevMessage() {
		System.err.println("This is dev environment.");
	}
	
}
