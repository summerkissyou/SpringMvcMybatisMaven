package com.sun.demo.base.Thread;

public class MyThread implements Runnable{
    int no;


	public  MyThread(int no) {
		this.no=no;

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("no"+no);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}