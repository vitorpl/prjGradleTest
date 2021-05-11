package com.example.gdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrjGradle1Application {

	public static void main(String[]  args) {
		System.out.println("Testando o gradle no jenkins");
		SpringApplication.run(PrjGradle1Application.class, args);
	}

}
