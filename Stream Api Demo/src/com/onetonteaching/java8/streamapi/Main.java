package com.onetonteaching.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> list = Arrays.asList(2, 3, 4, 7, 5, 9);
		
		// External iteration 
		
//		for (int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//			
//		}
		
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//			
//		}
		
//		for(int i : list)
//			System.out.println(i);
		
		// Internal iteration
		
////		list.forEach(i -> System.out.println(i)); // takes object of Consumer interface
		
////		Using Consumer interface (functional interface)
		
//		Consumer<Integer> consumer = new Consumer<Integer>() {  // Anonymous class
//		
//			public void accept(Integer i) {
//				
//				System.out.println(i);
//				
//			}
//			
//		};
		
//		list.forEach(consumer);
		
////	Using Anonymous Object 
		
//		list.forEach(new Consumer<Integer>() {  // as the consumer object has been used only once
//		
//			public void accept(Integer i) {
//				
//				System.out.println(i);
//				
//			}	
//		});
		
////	Using Lambda expression
		
//		list.forEach(i -> System.out.println(i)); // as this is functional interface we should use lambda expression
		
////		Using Method reference
		
//		list.forEach(System.out :: println);
		
//		list.forEach(i -> checkEven(i)); // own function using lambda expression
//		list.forEach(Main :: checkEven); // own function using method reference
		
//		Stream and ParallelStream
		
//		Stream<Integer> stream;
//		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			
			list.add(i);
			
		}
		
//		stream = list.stream();
//		stream.forEach(System.out :: println); // or list.stream().forEach(System.out :: println);
//		stream.forEach(System.out :: println); // it will raise exception; coz once stream is used can't be used again
		
//		list.parallelStream().forEach(System.out :: println); // uses multiple cores ; order of printing is not in sequence
		
//		Map, filter, reduce - java 8 functional programming approach
		
//		System.out.println(list.stream().map(i -> i * 3).reduce(Integer :: sum).orElse(0)); // example returns 135 ; using lambda expression 
		
////		Internal working 
		
		Stream<Integer> stream = list.stream(); // converts list into stream
		
		Function<Integer, Integer> function = new Function<Integer, Integer>() { // anonymous class definition 

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * 3;
			}
			
		};
		
		Stream<Integer> stream1 = stream.map(function); // map takes object of Function interface (functional interface) ; this stream1 contains elements, generated after applying function
		
		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				
				// TODO Auto-generated method stub
				return t + u;
				
			}
		};
			
		int result = stream1.reduce(0, binaryOperator); // reduce takes object of BinaryOperator interface(functional interface); first parameter is identity value
		
		System.out.println(result); // returns 135 
			
		
		
	}

//	public static void checkEven(Integer i) {
//		
//		if (i % 2 == 0) {
//			
//			System.out.println(i);
//			
//		}
//		
//	}
	
}

