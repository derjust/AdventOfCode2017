package com.github.derjust.adventofcode2017.day2;

public class SpreadSheetSolver {
    public int solve(String spreadsheet) {

        String[] rows = spreadsheet.split("\n");

        int sum = 0;
        for(String row : rows) {
            String[] cells = row.split("\\s+");

            int min = Integer.parseInt(cells[0]);
            int max = min;

            for(String cell : cells) {

                min = Math.min(min, Integer.parseInt(cell));
                max = Math.max(max, Integer.parseInt(cell));

            }

            sum += (max - min);


        }

        return sum;

    }
}
