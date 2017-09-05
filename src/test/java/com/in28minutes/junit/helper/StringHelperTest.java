package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
		
	@Before
	
	public void before() {
		
		helper = new StringHelper(); 
	}
	

	@Test
	public void testtruncateAInFirst2Positions_Ainfirst2Positions() {
		
		//AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
		//expected, actual
	}
	
	
	@Test
	
	public void testtruncateAInFirst2Positions_fortwocharstrreplaceawithnull()
	{
		assertEquals("", helper.truncateAInFirst2Positions("AA"));
	}

	@Test
	
	public void testtruncateAInFirst2Positions2_AinFirstPosition()
	{
		
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testtruncateAInFirst2Positions2_NoA()
	{
		
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testtruncateAInFirst2Positions2_AinLastTwoPositions()
	{
		
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	
	// ABCD => false, ABAB => true, AB => true,  A => false
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegativeSenario() {
			
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}
	
	@Test
	
	public void testareFirstAndLastTwoCharchtersTheSame_BasicPositiveSenario() {
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	
	public void testareFirstAndLastTwoCharchtersTheSame_BasicPositiveSenario_withtwochars()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	
	public void testareFirstAndLastTwoCharchtersTheSame_BasicPositiveSenario_withonechar()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
}	


