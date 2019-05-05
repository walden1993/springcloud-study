package com.huarong.payserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudPayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudPayServerApplication.class, args);
	}

}
