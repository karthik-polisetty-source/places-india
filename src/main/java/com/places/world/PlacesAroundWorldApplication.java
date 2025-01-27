package com.places.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class PlacesAroundWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacesAroundWorldApplication.class, args);
	}

}
