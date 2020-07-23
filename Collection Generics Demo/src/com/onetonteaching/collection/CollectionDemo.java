package com.onetonteaching.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Iterator;
//
//import java.util.List;
//import java.util.Vector;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// need
		
//		int arr[] = new int[4]; // fixed size, no expansion or shrinking
//		Object objects[] = new Object[4];
//		objects[0] = "Hello world";
//		objects[1] = 3;
		
//		Collection data = new ArrayList<>(); // collection of objects
//		Collection<Integer> data = new ArrayList<Integer>(); // of integers
//		data.add(5); // adding at the end
//		data.add(13); 
//		data.remove(5); // removing
//		data.add("One To N Teaching");
		
		// for printing values a. iterator b. enhanced for loop
		
//		for (Iterator iterator = data.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
		
//		for (Integer object : data) {
//			System.out.println(object);
//		}
		
		// List demo
		
//		List<Integer> myList = new ArrayList<>();
//		myList.add(5);
//		myList.add(6);
//		myList.add(0, 7); // allows in-between insertion
//		Collections.sort(myList); 
//		myList.get(1); // fetches value from the index
//		myList.forEach(System.out::print); // stream api (Java 8 feature)
		
		// vector demo
		
//		Vector<Integer> vector = new Vector<>();
//		System.out.println(vector.capacity()); // initial capacity 10, if we exceed then gets incremented by 100%
//		vector.add(6); // adding
//		vector.add(0, 2); // adding at specific position
//		
		
		// diff between arraylist and vector 
//		a. arraylist increases capacity by 50% so saves memory
//		b. vector slow, arraylist faster
//		c. vector thread safe(methods are synchronized), arraylist not
		
		
		// diff between linkedlist and arraylist
//		a. linkedlist is implemented by doubly linked list, arraylist is implemented by dynamic array
//		b. when inserting value in the middle is concern, linkedlist works faster coz of pointer manipulation, no need of shifting.
//		c. when fetching value is concern, arraylist works faster coz of indexing 
		
		// Set Demo
		
//		Set<Integer> mySet = new HashSet<>(); // fetching order is random
//		Set<Integer> mySet = new TreeSet<>(); // fetching is done in sorted manner
//		System.out.println(mySet.add(45));
//		System.out.println(mySet.add(10));
//		System.out.println(mySet.add(54));
//		System.out.println(mySet.add(90));
//		System.out.println(mySet.add(45)); // duplicate element; returns false
//		
//		mySet.forEach(System.out::println);
		
		
		// Map Demo (Directed non-weighted graph representation)
		
//		Map<Integer, List<Integer>> graph = new HashMap<>(); // not thread safe, faster
//		Map<Integer, List<Integer>> graph = new Hashtable<>(); // thread safe, slower
//		Map<Integer, List<Integer>> graph = new TreeMap<>(); // in sorted order
//		
//		graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
//		graph.put(2, new ArrayList<>(Arrays.asList(3, 4)));
//		graph.put(3, new ArrayList<>(Arrays.asList(4)));
		
//		Set<Integer> vertices = graph.keySet();
//		
//		for(int vertex : vertices) {
//			
//			System.out.println(vertex + "-> " + graph.get(vertex));
//			
//		}
		
//		Set<Map.Entry<Integer, List<Integer>>> valuesEntries = graph.entrySet();
//		
//		for(Map.Entry<Integer, List<Integer>> value : valuesEntries) {
//			
//			System.out.println(value.getKey() + "-> " + value.getValue());
//			
//		}
		
	}

}