package com.neusoft.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
public class HisApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(HisApplication.class, args);
	}

}
