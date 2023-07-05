package com.functional;

public class TwoNumber {

	public static void main(String[] args) {
		
		Addition adding = (int x, int y)-> x+y;
		
	int afterAddition =	adding.add(5,8);
	
	System.out.println("5 + 8 = "+afterAddition);

	}

}
