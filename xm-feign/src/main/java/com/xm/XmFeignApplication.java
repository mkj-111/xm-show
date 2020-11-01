package com.xm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class XmFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmFeignApplication.class, args);
		System.out.println("xmfeign成功");
	}

}
