package com.minbak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinbakApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinbakApplication.class, args);
		System.out.println("hello, world!");
	}

}
