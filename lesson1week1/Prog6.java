package com.edu.mum;

import java.util.ArrayList;
import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		int i=0;
		ArrayList<String> names= new ArrayList<String>();
		ArrayList<String> noDup= new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter five animal names duplicate is allowed");
		while(i<6){
			names.add(sc.next());
			i++;
		}
		
           for (String string : names) {
        	boolean  flag=false;
        	   if(noDup.size()==0){
        		   noDup.add(string);
        	   }
        	   else{
            	   for (String string1 : noDup) {
            		   if(string1.equals(string)){
            			   flag=true;
            			   
            		   }
       				
       			}
            	   if(!flag){
            		   noDup.add(string);
            		   
            	   }
        	   }
		}

		System.out.println(names);
		System.out.println(noDup);
		sc.close();

	}

}
