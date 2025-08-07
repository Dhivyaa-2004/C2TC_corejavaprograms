package com.tnsif.Day2;

public class NestedForLoop {

	public static void main(String[] args) {
		//int one=1;
		//int five=5;
		for(int i=1; i<=5;i++) {
			for(int j=1;j<11;j++) {
				System.out.println(i+ " X "+ j + " = " + i*j);					
			}
			System.out.println();
		}
	}
}
