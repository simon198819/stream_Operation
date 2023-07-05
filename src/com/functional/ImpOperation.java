package com.functional;

public class ImpOperation {

	public static void main(String[] args) {
		Square squareValue = (int x) -> x*x;
		
		int sqrValue =squareValue.square(5);
		
		System.out.println(sqrValue);

	}

}
