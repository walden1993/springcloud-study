package com.huarong.payclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huarong.payclient.hystrix.HelloRemoteHystrix;

@FeignClient(name="spring-cloud-pay-server",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name") String name);
	
}
