package com.github.derjust.adventofcode2017.day6;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MemoryBankBalancerTest {

	private MemoryBankBalancer underTest;

	@Before
	public void setUp() {
		underTest = new MemoryBankBalancer();
	}
	
	@Test
	public void testToCombination() {
		BigDecimal actual = underTest.toCombination(new int[] { 13, 4, 5, 9});
		
		assertEquals(new BigDecimal("13040509"), actual);
	}
	
	@Test
	public void testSample1() {
		
		int actual = underTest.solve(new int[] {0, 2, 7, 0});
		
		assertEquals(5, actual);
	}
}
