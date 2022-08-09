package com.idat.springbootapirestventas.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.idat.springbootapirestventas.app.controller"})
public class SpringBootApirestVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApirestVentasApplication.class, args);
	}

}
