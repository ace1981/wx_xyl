package com.hujao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class XylwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(XylwebApplication.class, args);
	}
}
