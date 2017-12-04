package com.github.derjust.adventofcode2017.day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Puzzle3Test {
    private SpreadSheetSolver underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new SpreadSheetSolver();
    }

    @Test
    public void testSample1() {
        int actual = underTest.solve("5 1 9 5\n" +
                "7 5 3\n" +
                "2 4 6 8");

        assertEquals(18, actual);
    }

}