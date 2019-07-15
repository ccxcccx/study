package com.study.server.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启更新功能
public class HelloController {
	@Value("${name}")
	String name;
	
	@Value("${foo}")
	String foo;
	
	@Value("${foo1}")
	String foo1;
	
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo+"**"+name+"**"+foo1;
	}
}
