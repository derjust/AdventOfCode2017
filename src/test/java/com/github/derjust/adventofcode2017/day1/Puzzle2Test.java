package com.github.derjust.adventofcode2017.day1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Puzzle2Test {

	private RingCaptchaSolver underTest;

	@Before
	public void setUp() {
		underTest = new RingCaptchaSolver();
	}
	
	@Test
	public void testSample1() {
		assertEquals(6, underTest.solve("1212"));
	}
	
	@Test
	public void testSample2() {
		assertEquals(0, underTest.solve("1221"));
	}
	
	@Test
	public void testSample3() {
		assertEquals(4, underTest.solve("123425"));
	}
	
	@Test
	public void testSample4() {
		assertEquals(12, underTest.solve("123123"));
	}
	
	@Test
	public void testSample5() {
		assertEquals(4, underTest.solve("12131415"));
	}
}
