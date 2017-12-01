package com.github.derjust.adventofcode2017.day1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Puzzle1Test {

	@Test
	public void testSample1() {
		CaptchaSolver underTest = new CaptchaSolver();
		
		"1122".chars().forEach(underTest);
		
		assertEquals(3, underTest.sum());
	}
	
	@Test
	public void testSample2() {
		CaptchaSolver underTest = new CaptchaSolver();
		
		"1111".chars().forEach(underTest);
		
		assertEquals(4, underTest.sum());
	}
	
	@Test
	public void testSample3() {
		CaptchaSolver underTest = new CaptchaSolver();
		
		"1234".chars().forEach(underTest);
		
		assertEquals(0, underTest.sum());
	}

	@Test
	public void testSample4() {
		CaptchaSolver underTest = new CaptchaSolver();
		
		"91212129".chars().forEach(underTest);
		
		assertEquals(9, underTest.sum());
	}
	
}
