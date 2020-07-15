package com.onetonteaching.multithreading;

public class MultiThreadingUsingLambdaExpression {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Runnable obj1 = () -> {
//			
//				// TODO Auto-generated method stub
//				for (int i = 0; i < 5; i++) {
//					
//					System.out.println("Boom!");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//		};
//		Runnable obj2 = () -> {
//				// TODO Auto-generated method stub
//				for (int i = 0; i < 5; i++) {
//					
//					System.out.println("Blah!");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//		};
//		Thread t1 = new Thread(obj1);
//		Thread t2 = new Thread(obj2);
		Thread t1 = new Thread(() -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Blah!" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}, "Blah Thread");
		Thread t2 = new Thread(() -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Boom!" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}, "Boom Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
//		System.out.println(t1.isAlive()); //true
//		System.out.println(t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println("Done..");
		
	}

}
