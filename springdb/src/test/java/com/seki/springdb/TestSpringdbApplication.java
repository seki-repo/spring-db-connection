package com.seki.springdb;

import org.springframework.boot.SpringApplication;

public class TestSpringdbApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringdbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
