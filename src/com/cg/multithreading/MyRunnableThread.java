package com.cg.multithreading;

public class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}
