package com.xm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XmProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmProviderApplication.class, args);
        System.out.println("xmprovider成功");
    }

}
