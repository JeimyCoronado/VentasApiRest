package com.idat.springbootapirestventas.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringBootApirestVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApirestVentasApplication.class, args);
	}

}
