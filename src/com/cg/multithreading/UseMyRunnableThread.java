package com.cg.multithreading;

public class UseMyRunnableThread {

	public static void main(String[] args) {
		
		
		MyRunnableThread mt=new MyRunnableThread();
		
//		for(int i=1; i<=5; i++) {
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		t1.setName("Thread 1");
		t1.start();
		
		try {
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Thread t3=new Thread(mt);
		t3.start();
//		}
	}

}
