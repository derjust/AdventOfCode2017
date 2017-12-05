package com.github.derjust.adventofcode2017.day4;

import java.util.HashSet;

public class PasswordChecker {

	
	public boolean isValid(String input) {
		
		HashSet<String> cache = new HashSet<>();
		
		String[] passwords = input.split(" ");
		
		boolean result = true;
		
		for(String password : passwords) {
			
			if (cache.contains(password)) {
				result = false;
			} else {
				cache.add(password);
			}
			
		}
		
		return result;
	}
	
}
