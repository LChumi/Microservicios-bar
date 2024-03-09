package com.lchumi.puntocero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PuntoCeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntoCeroApplication.class, args);
	}

}
