package com.tnsif.Day2;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c=25;

		int answer = (a > b) ? a: b;
		String ans = (a<b) ? "a is lesser": "b is bigger";
		System.out.println(ans);
		System.out.println("Bigger number is: " + answer);
		
		String x = (a%2==0)?"Even":"odd";
		System.out.println(x);
		
		int y = (a>b)?((a>c) ? a:c ): ((b>c) ? b:c);
		System.out.println(y);



	}

}
