package com.github.derjust.adventofcode2017.day4;

import java.util.Arrays;
import java.util.HashSet;

public class AnagramChecker {

	
	public boolean isValid(String input) {
		
		HashSet<String> cache = new HashSet<>();
		
		String[] passwords = input.split(" ");
		
		boolean result = true;
		
		
		
		for(String password : passwords) {
			
			char[] passwordChar = password.toCharArray();
			Arrays.sort(passwordChar);
			String sortedPassword = new String(passwordChar);
			
			if (cache.contains(sortedPassword)) {
				result = false;
			} else {
				cache.add(sortedPassword);
			}
			
		}
		
		return result;
	}
	
}
