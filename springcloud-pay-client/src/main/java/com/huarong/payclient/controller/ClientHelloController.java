package com.huarong.payclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huarong.payclient.service.HelloRemote;

@RestController
@RefreshScope
public class ClientHelloController {
	
	@Autowired
	HelloRemote helloRemote;
	
	@GetMapping("/hello/client/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}
	
	@Value("${walden.hello}")
    private String hello;

	@GetMapping("/config/hello")
    public String from() {
        return this.hello;
    }
}
