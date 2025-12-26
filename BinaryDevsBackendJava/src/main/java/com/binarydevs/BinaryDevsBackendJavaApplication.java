package com.binarydevs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinaryDevsBackendJavaApplication {

	@Autowired
	private org.springframework.data.mongodb.core.MongoTemplate mongoTemplate;
	
	@jakarta.annotation.PostConstruct
	public void checkDb() {
	    System.out.println("🔥 CONNECTED DATABASE: " + mongoTemplate.getDb().getName());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BinaryDevsBackendJavaApplication.class, args);
	}

}
