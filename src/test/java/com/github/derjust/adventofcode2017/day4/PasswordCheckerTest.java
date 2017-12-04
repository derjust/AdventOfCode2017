package com.github.derjust.adventofcode2017.day4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest {

	private PasswordChecker underTest;

	@Before
	public void setUp() {
		underTest = new PasswordChecker();
	}
	
	@Test
	public void testSample1() {
		assertTrue(underTest.isValid("aa bb cc dd ee"));
	}
	
	@Test
	public void testSample2() {
		assertFalse(underTest.isValid("aa bb cc dd aa"));
	}

	@Test
	public void testSample3() {
		assertTrue(underTest.isValid("aa bb cc dd aaa"));
	}
}
