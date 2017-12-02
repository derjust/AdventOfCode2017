package com.github.derjust.adventofcode2017.day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Puzzle4Test {
    private SpreadSheetDivSolver underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new SpreadSheetDivSolver();
    }

    @Test
    public void testSample1() {
        int actual = underTest.solve("5 9 2 8\n" +
                "9 4 7 3\n" +
                "3 8 6 5");

        assertEquals(9, actual);
    }

}