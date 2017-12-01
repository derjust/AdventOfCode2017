package com.github.derjust.adventofcode2017.day1;

import java.util.function.IntConsumer;

class CaptchaSolver implements IntConsumer {

	int first;
	int last = -1;
	int sum = 0;

	@Override
	public void accept(int value) {
		if (last == -1) {
			first = value;
		} else {
			if (last == value) {
				sum += value - '0';
			}
		}
		last = value;
	}
	
	public int sum() {
		if (first == last) {
			sum += last - '0';
		}
		return sum;
	}
}