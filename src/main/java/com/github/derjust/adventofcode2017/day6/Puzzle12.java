package com.github.derjust.adventofcode2017.day6;

public class Puzzle12 {

	public static void main(String[] args) {
		MemoryBankBalancer balancer = new MemoryBankBalancer();
		
		int result = balancer.solve(new int[] {4,10,4,1,8,4,9,14,5,1,14,15,0,15,3,5});

		System.out.println(result);

	}

}
