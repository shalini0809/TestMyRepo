package com.cg.multithreading;

public class MyThread extends Thread{
 
	public void run(){
for(int i=100; i<=105;i++) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println(i+"-"+Thread.currentThread().getId());
}
	}
	

}
