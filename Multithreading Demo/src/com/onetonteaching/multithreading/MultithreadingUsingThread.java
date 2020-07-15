package com.onetonteaching.multithreading;

public class MultithreadingUsingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();

	}

}

class A extends Thread{
	
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

class B extends Thread{
	
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