package com.onetonteaching.concurrency;

public class VisibilityProblem {
	
	static volatile boolean flag = true;
	
	public static void main(String args[]) {
		
		A objA = new A();
		B objB = new B();
		
		objB.start();
		objA.start();
		
	}

}

class A extends Thread{
	
	public void run() {
		
		VisibilityProblem.flag = false;
		
	}
	
}

class B extends Thread{
	
	public void run() {
		
		while (VisibilityProblem.flag) {
			
			System.out.println("Do something...");
			
		}
		
	}
	
}