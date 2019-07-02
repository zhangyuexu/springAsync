package com.zyx.spring.thread.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan("com.zyx.spring.thread.test")
@EnableAsync
public class Config {

}
