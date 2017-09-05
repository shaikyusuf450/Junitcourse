package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
	
	// Arrays.sort

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		
		int[] numbers = {};
		int[] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		//assertArrayEquals(expected,numbers);


}
	
	
}
