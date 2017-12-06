package com.github.derjust.adventofcode2017.day6;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MemoryBankBalancerWithLoopTest {

	private MemoryBankBalancerWithLoop underTest;

	@Before
	public void setUp() {
		underTest = new MemoryBankBalancerWithLoop();
	}
	
	@Test
	public void testSample1() {
		
		int actual = underTest.solve(new int[] {0, 2, 7, 0});
		
		assertEquals(4, actual);
	}
}
