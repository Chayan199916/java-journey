package com.onetonteaching.annotation;

import java.util.ArrayList;
import java.util.List;


public class InternalAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubDemo objDemo = new SubDemo();
		objDemo.doSomething();
		objDemo.doIt(); // line-through shows deprecated

	}

}

class Demo{
	
	public void doSomething() {
		
		
	}
	
}

class SubDemo extends Demo{
	
	@Deprecated
	public void doIt() {
		
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void doSomething() { // checks at compile time whether such function in parent class exists or not
		
		List list = new ArrayList();
		list.add(5);
		list.add("Hello");
		
		list.forEach(System.out :: println);
		
	}
	
}

@FunctionalInterface
interface DemoInterface{
	
	void show();
//	void show2(); // stops at compile time
	
}