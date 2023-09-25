package com.in28minutes.rest.microservices.currencyconversionservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class CurrencyConversionService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionService1Application.class, args);
	}

}
