package com.tnsif.Day2;

public class Ternary {

	public static void main(String[] args) {
		int a=10,b=20,c=25;
		int ans=(a>b)? a:b;
		String answer=(a<b)? "a is lesser":"b is bigger";
		System.out.println(answer);
		System.out.println("the bigger number is " +ans);
		String k=(a%2==0)?"even":"odd";
		System.out.println(k);
		int y=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(y);

	}

}
