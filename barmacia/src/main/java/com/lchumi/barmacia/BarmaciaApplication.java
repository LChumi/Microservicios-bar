package com.lchumi.barmacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BarmaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarmaciaApplication.class, args);
	}

}
