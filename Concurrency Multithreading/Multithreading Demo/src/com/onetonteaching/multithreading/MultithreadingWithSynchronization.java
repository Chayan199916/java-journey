package com.onetonteaching.multithreading;

public class MultithreadingWithSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}
				
			}
		}, "counter thread1");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}
				
			}
		}, "counter thread2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join(); 
			t2.join(); // waits until the thread's execution is over
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1.count);

	}

}

class Counter{
	
	int count;
	public synchronized void increment() {
		
		count++;
		
	}
	
}