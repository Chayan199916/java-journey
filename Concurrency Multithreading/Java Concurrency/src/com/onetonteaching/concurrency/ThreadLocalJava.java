package com.onetonteaching.concurrency;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * tools to enable parallelism :
 * 1. Threads
 * 2. ThreadPool
 * 	--ExecutorService
 * 	--ForkJoinPool
 * 	--Custom ThreadPools(eg. WebServers)
 * 
 * 
 * */


public class ThreadLocalJava {
	
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
	private static int counter = 0;
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			
//			new Thread(() -> {
//				
//				String birthDatString = new ThreadLocalJava().birthDate();
//				System.out.println(birthDatString);
//				
//			}).start();
			
			threadPool.submit(() -> {
				
				String birthDatString = new ThreadLocalJava().birthDate();
				list.add(birthDatString + " " + Integer.toString(new ThreadLocalJava().increment()));
				
			});
			
		}
		
		Thread.sleep(1000);
		threadPool.shutdown();
		if (!threadPool.awaitTermination(5000, TimeUnit.SECONDS)) {
			
			System.err.println("Threads didn't finish in 5000 seconds!");
			
		}
		System.out.println("finished");
		System.out.println(list.size());

	}
	
	public synchronized int increment() {
		
		counter = counter + 1;
		return counter;
		
	}
	
	public String birthDate() {
		
		DateFetcher dFetcher = new DateFetcher();
		Date birthString = dFetcher.getDate();
		SimpleDateFormat dFormat = ThreadSafeFormatter.dateFormatter.get();
		return dFormat.format(birthString);
		
	}

}

class DateFetcher{
	
	Date dateString;
	
	public DateFetcher() {
		
		dateString = new Date();
		
	}
	
	Date getDate() {
		
		return dateString;
		
	}
	
}

class ThreadSafeFormatter{
	
//	public static ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<>() {
//		
//		@Override
//		protected SimpleDateFormat initialValue() {
//			
//			return new SimpleDateFormat("HH:MM:ss yyyy-MM-dd");
//			
//		}
//		
//		@Override
//		public SimpleDateFormat get() {
//			
//			return super.get();
//			
//		}
//		
//	};
	
	// java 8 feature 
	
	public static ThreadLocal<SimpleDateFormat> dateFormatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("HH:MM:ss yyyy-MM-dd"));
		
}