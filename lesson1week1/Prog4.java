package com.edu.mum;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		//this program is for reversing a word with out using special java api methods and Arrayys.
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter word");
		String word=sc.next();
		for (int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
			
		}
           sc.close();
	}

}
