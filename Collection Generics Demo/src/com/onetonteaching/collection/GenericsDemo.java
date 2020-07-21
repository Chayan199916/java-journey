package com.onetonteaching.collection;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCOntainer<Number> myCOntainer = new MyCOntainer();
		myCOntainer.num = 5;
//		System.out.println(myCOntainer.getNum());
		myCOntainer.showtype();
		myCOntainer.doSomething(new ArrayList<Integer>());
		
	}

}

class MyCOntainer<T extends Number>{ // restricting only subclasses(Integer, Float, Double); super restricts only super classes
	
	T num;
	
	public void setNum(T num) {
		this.num = num;
	}
	
	public T getNum() {
		return num;
	}
	
	public void showtype() {
		System.out.println(num.getClass().getName());
	}
	
	public void doSomething(ArrayList<? extends T> arrayList) { // accepts any subclasses of T
		
		
	}
	
}