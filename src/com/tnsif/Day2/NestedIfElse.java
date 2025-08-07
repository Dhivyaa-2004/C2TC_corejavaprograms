package com.tnsif.Day2;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=3, b=1, c=2;

		if (a>b) {
			if (a>c)
				System.out.println("a is greater");
			else
				System.out.println("c is greater");

		} else {
			if (b>c)
				System.out.println("b is greater");
			else
				System.out.println("c is greater");
		}
	}
}
