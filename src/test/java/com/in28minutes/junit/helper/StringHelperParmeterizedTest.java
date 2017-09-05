package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperParmeterizedTest {
	
	StringHelper helper = new StringHelper();
	
	private String expectedOutput;
	private String input;
	


	public StringHelperParmeterizedTest(String expectedOutput, String input) {
		super();
		this.expectedOutput = expectedOutput;
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		
		String expectedOutputs [][] ={
		{"CD", "AACD"},
		{"CD", "ACD"}
		
		};
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testtruncateAInFirst2Positions_Ainfirst2Positions() {
		
		//AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
		//assertEquals("expectedOutput", helper.truncateAInFirst2Positions("input"));
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		
		//expected, actual
	}
	
	
}	


