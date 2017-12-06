package com.github.derjust.adventofcode2017.day6;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemoryBankBalancerWithLoop {

	private final Map<BigDecimal, Integer> knownCombinations = new HashMap<>();
	private int steps = 0;
	
	protected BigDecimal toCombination(int[] configuration) {
		BigDecimal result = new BigDecimal(0);
		for(int i = 0; i < configuration.length; i++) {
			
			BigDecimal nr = new BigDecimal(configuration[configuration.length-1-i]);
			BigDecimal factor = new BigDecimal(100).pow(i);
			
			result = result.add(nr.multiply(factor));
		}
		return result;
	}
	
	public int solve(int[] memoryBanks) {

		redistribute(memoryBanks);
		steps++;
		BigDecimal currentState = toCombination(memoryBanks);
		if (knownCombinations.containsKey(currentState)) {
			return steps - knownCombinations.get(currentState);
		} else {
			knownCombinations.put(toCombination(memoryBanks), steps);
			return solve(memoryBanks);
		}
	}

	private int nextPos(int pos, int[] memoryBanks) {
		pos++;
		if (pos >= memoryBanks.length) {
			pos = 0;
		}
		return pos;
	}
	
	private void redistribute(int[] memoryBanks) {
		int heigh = -1;
		int pos = 0;
		for(int i = 0; i < memoryBanks.length; i++) {
			if (memoryBanks[i] > heigh) {
				pos = i;
				heigh = memoryBanks[i];
			}
		}
		
		memoryBanks[pos] = 0;
		pos = nextPos(pos, memoryBanks);

		
		for(int i = 1; i <= heigh; i++) {
			memoryBanks[pos] = memoryBanks[pos] + 1;

			pos = nextPos(pos, memoryBanks);
		}
	}
}
