package com.zyx.spring.thread.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		DemoService demoService=ac.getBean(DemoService.class);
		//如果不用异步，那就只能循环一直打印a
		demoService.a();
		demoService.b();
	}

}
