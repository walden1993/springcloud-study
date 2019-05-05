package com.huarong.payclient.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.huarong.payclient.service.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello" +name+", this messge send failed ";
	}

}
