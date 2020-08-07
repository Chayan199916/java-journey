package com.onetonteaching.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils objDemo1;
	
	@BeforeEach
	void init() {
		
		objDemo1 = new MathUtils();
		
	}

	@Test
	void testAdd() {
		
		int actual = objDemo1.add(2, 5);
		int expected = 7;
			
		assertEquals(expected, actual, "Wrong output!");

	}
	
	@Test
	void testDivide() {
		
		//test fails if no exception is thrown or different exception is thrown.
		assertThrows(ArithmeticException.class, () -> objDemo1.divide(1, 0), "Divide by zero should throw arithmetic exception");
		
	}
	
	@Test
	void testComputeCircleArea() {
		
		double actual = Math.round(objDemo1.computeCircleArea(10) * 100.0) / 100.0;
		double expected = 314.15;
		
		assertEquals(expected, actual, "Wrong output!");
		
	}
	
}
