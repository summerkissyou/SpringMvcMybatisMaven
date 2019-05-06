package com.sun.demo.base.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.sun.glass.ui.Timer;

public class ScheduledThreadPoolTest {

	public static void main(String[] args) {
		
		ScheduledThreadPoolExecutor p1=(ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);
		p1.setCorePoolSize(2);
		p1.setMaximumPoolSize(4);
		
		for(int i=0;i<50;i++) {
			try {
				p1.scheduleAtFixedRate(new MyThread(i),0,30,TimeUnit.SECONDS);
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

