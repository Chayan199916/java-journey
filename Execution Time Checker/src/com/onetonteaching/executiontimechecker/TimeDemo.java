package com.onetonteaching.executiontimechecker;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.EndDocument;

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>() // Double brace initialization
				{{
					add(12);
					add(13);
				}};
				
		Long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			
			list.add(i);
			
		}
		
		Long finish = System.currentTimeMillis();
		
		System.out.println("Took " + Double.toString(finish - start));
				
				
	}

}
