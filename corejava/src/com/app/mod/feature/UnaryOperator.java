package com.app.mod.feature;

public class UnaryOperator {
	
	public static void main (String [] args) {
		int a =1,b=2,c=3;
		int d = a++ + 
				b++ + 
				++c + 
				c++ + 
				++b + 
				++a -
				a++;
		System.out.println(d);
	}

}
