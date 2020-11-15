package com.xm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication

public class OssApplication {

	public static void main(String[] args) {
		SpringApplication.run(OssApplication.class, args);
	}

}
