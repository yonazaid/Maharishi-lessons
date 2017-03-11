package com.edu.mum;

public class Prog7 {

	public static void main(String[] args) {
		int cnt=0;
		for (int i = 0; i < args.length; i++) {
			System.out.println("argument # "+i+"="+args[i]);
			if(args[i].startsWith("A")){
				cnt++;
			}
		}
        System.out.println("number of arguments that starts With \'A\':"+cnt);
	}
	
}
