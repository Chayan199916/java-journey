package com.onetonteaching.multithreading;

public class MultithreadingUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = new C();
		Runnable obj2 = new D();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}

class C implements Runnable{
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Blah!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class D implements Runnable{
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Boom!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}