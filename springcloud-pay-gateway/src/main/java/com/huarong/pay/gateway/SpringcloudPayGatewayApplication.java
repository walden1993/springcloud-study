package com.huarong.pay.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudPayGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudPayGatewayApplication.class, args);
	}

}
