package com.github.derjust.adventofcode2017.day2;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SpreadSheetDivSolver {

    private int processRow(int[] iCells) {

        for (int i = 0; i < iCells.length; i++) {
            for (int j=i + 1; j < iCells.length; j++) {

                int a = iCells[i];
                int b = iCells[j];

                if (a % b == 0) {
                    return a / b;
                } else if (b % a == 0) {
                    return b / a;
                }

            }
        }
        throw new IllegalArgumentException("No paris found!");
    }

    public int solve(String spreadsheet) {

        String[] rows = spreadsheet.split("\n");

        int sum = 0;
        for(String row : rows) {
            String[] cells = row.split("\\s+");

            int[] iCells = stream(cells).mapToInt(Integer::parseInt).toArray();

            int rowResult = processRow(iCells);

            sum += rowResult;

        }

        return sum;

    }
}
