package com.onetonteaching.multithreading;


// Producer-Consumer problem
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new Resource();
		new Producer(resource);
		new Consumer(resource);

	}

}

class Resource{
	
	int num;
	boolean flag = false;
	
	public synchronized void setNum(int num) {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("put :" + num);
		this.num = num;
		flag = true;
		notify();
	}
	
	public synchronized void getNum() {
		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get :" + num);
		flag = false;
		notify();
	}
	
}

class Producer implements Runnable{
	
	Resource resource;
	public Producer(Resource resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
		Thread t = new Thread(this, "Producer thread");
		t.start();
	}
	
	public void run() {
		
		int i = 0;
		while (true) {
			
			resource.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class Consumer implements Runnable{
	
	Resource resource;
	public Consumer(Resource resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
		Thread t = new Thread(this, "Consumer Thread");
		t.start();
	}
	
	public void run() {
		
		while (true) {
			
			resource.getNum();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}