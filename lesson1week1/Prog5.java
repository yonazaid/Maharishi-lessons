package com.edu.mum;

public class Prog5 {

	public static void main(String[] args) {
		int[][] x=new int[4][4];
		String se="________";
        for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j]=RandomNumbers.getRandomInt(1, 100);
				
				if(i==1||i==3){
					System.out.printf("+");
					System.out.printf("%-14d",x[i][j]);
					
				}
				else  System.out.printf(" %-14d",x[i][j]);
			
			}
			System.out.printf("%n");
			if(i==3||i==1){
				System.out.printf("%-14s%-16s%-15s%-15s",se,se,se,se);
			}
		      if(i==1)
			System.out.printf("%n%n%n");
		      else System.out.printf("%n");
		
	}

	}
}