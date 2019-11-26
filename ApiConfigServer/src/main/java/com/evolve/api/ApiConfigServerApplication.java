package com.evolve.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//Below annotation makes this application as config service  
@EnableConfigServer
public class ApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConfigServerApplication.class, args);
	}

}
