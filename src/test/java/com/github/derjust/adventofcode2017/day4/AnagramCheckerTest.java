package com.github.derjust.adventofcode2017.day4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramCheckerTest {

	private AnagramChecker underTest;

	@Before
	public void setUp() {
		underTest = new AnagramChecker();
	}
	
	@Test
	public void testSample1() {
		assertTrue(underTest.isValid("abcde fghij"));
	}
	
	@Test
	public void testSample2() {
		assertFalse(underTest.isValid("abcde xyz ecdab"));
	}
	
	@Test
	public void testSample3() {
		assertTrue(underTest.isValid("a ab abc abd abf abj"));
	}
	
	@Test
	public void testSample4() {
		assertTrue(underTest.isValid("iiii oiii ooii oooi oooo"));
	}
	
	@Test
	public void testSample5() {
		assertFalse(underTest.isValid("oiii ioii iioi iiio"));
	}
}
