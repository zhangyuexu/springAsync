package com.zyx.spring.thread.test;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/*
 * 这是一个spring对多线程并发的支持，即采用异步方式处理
 */
@Service
public class DemoService {
	@Async
	public void a() {
		while(true) {
			System.out.println("a");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	@Async
	public void b() {
		while(true) {
			System.out.println("b");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
}
