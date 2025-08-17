package com.tnsif.Day2;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3,c=1;
		if(a>b) {
			if(a>c) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
			
		}
		else {
			if(b>c) {
				System.out.println("B is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		}


	}

}
