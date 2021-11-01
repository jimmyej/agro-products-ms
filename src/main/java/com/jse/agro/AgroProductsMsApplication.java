package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AgroProductsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroProductsMsApplication.class, args);
	}

}
