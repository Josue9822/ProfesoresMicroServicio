package com.idat.Microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProfesorMicroServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfesorMicroServicioApplication.class, args);
	}

}
