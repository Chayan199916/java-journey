package com.onetonteaching.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<>();
		myList.add("Ball");
		myList.add("Dog");
		myList.add("Element");
		myList.add("Cat");
		myList.add("Apple");
		
//		myList.forEach(System.out::println);
		
//		Collections.sort(myList);// sorts alphabetically 
//		Collections.reverse(myList); // reverses the order
		
//		ComparatorImplementDemo objComparatorImplementDemo = new ComparatorImplementDemo();
//		Collections.sort(myList, objComparatorImplementDemo); // sorts acc to last character; customized comparator
		
	
		// anonymous class implementation
		
//		Comparator<String> myComparator = new Comparator<String>() {
//		
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				if (o1.charAt(o1.length() - 1) > o2.charAt(o2.length() - 1))
//					return 1;
//				
//				return -1;
//				
//			}
//		
//		};
//		
//		Collections.sort(myList, myComparator); // sorts acc to last character; customized comparator; using anonymous class
//		
		
		// functional interface should be implemented by lambda expression 
		
//		Comparator<String> myComparator = (o1, o2) -> o1.charAt(o1.length() - 1) > o2.charAt(o2.length() - 1) ? 1 : -1; // lambda expression implementation with ternary operator
//		
//		Collections.sort(myList, myComparator); 
//		
//		
		
		// using anonymous object 
		
//		Collections.sort(myList, (o1, o2) -> o1.charAt(o1.length() - 1) > o2.charAt(o2.length() - 1) ? 1 : -1); // uses lambda exp, anonymous object
		
		
		myList.forEach(System.out::println);

	}

}
