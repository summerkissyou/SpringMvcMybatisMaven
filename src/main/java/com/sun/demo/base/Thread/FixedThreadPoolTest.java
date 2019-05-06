package com.sun.demo.base.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolTest {

	public static void main(String[] args) {
		ThreadPoolExecutor p1=(ThreadPoolExecutor) Executors.newFixedThreadPool(1);
		p1.setCorePoolSize(2);
		p1.setMaximumPoolSize(10);
		for(int i=0;i<50;i++) {
			try {
				p1.execute(new MyThread(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("总线程数:"+p1.getTaskCount());
		}	
		while(true) {
			System.out.println("总线程数:"+p1.getTaskCount()+" 线程数:"+p1.getPoolSize()+" 活跃线程数:"+p1.getActiveCount()+" 已完成线程数:"+p1.getCompletedTaskCount());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		p1.shutdown();
		
	}


	
}

