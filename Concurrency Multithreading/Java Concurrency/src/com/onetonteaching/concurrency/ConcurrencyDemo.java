package com.onetonteaching.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyDemo {
	
	private static int availableTickets = 5;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ReentrantLock lock = new ReentrantLock();
		
		while (availableTickets > 0) {
			
			new Thread(() -> {
				
				lock.lock();
				try {
					
					if (availableTickets > 0) {
						
						bookTickets();
						availableTickets--;
						
					}
					
				} finally {
					
					lock.unlock();
					
				}
					
			}).start();
			
		}
		
		Thread.sleep(2000);

	}
	
	public static void bookTickets() {
		
		System.out.println("Booking Done...");
		
	}

}
