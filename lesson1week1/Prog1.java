package com.edu.mum;

public class Prog1 {

	public static void main(String[] args) {
		
		int x=RandomNumbers.getRandomInt(1, 9);
		System.out.println(x);
		System.out.println(Math.pow(Math.PI, x));
		System.out.println("-------------------");
		int y=RandomNumbers.getRandomInt(3, 14);
		System.out.println(y);
		System.out.println(Math.pow(Math.PI, y));

	}

}
