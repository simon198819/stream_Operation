package com.functional;

public class SubtractionofTwoNumber {

	public static void main(String[] args) {
	
		Substraction subtract=(int a,int b)->a-b;
		int usesubtract=subtract.sub(10, 5);
		System.out.println(usesubtract);
		
	}

}
