package com.github.derjust.adventofcode2017.day1;

class RingCaptchaSolver {
	
	public int solve(String input) {
		int sum = 0;
		
		int length = input.length();
		int offset = length/2;
		
		for (int i=0; i<length; i++) {
			
			char cur = input.charAt(i);

			int siblingOffset = i + offset;
			if (siblingOffset > length-1) {
				siblingOffset -= length;
			}
			
			if (cur == input.charAt(siblingOffset)) {
				sum += cur - '0';
			}
		}
		
		return sum;
	}
	
}
