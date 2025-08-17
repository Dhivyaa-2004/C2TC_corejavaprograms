package com.tnsif.Day1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=30.22f;
		double d=f;
		System.out.println(d);
		
		char ch='D';
		int a=ch;
		System.out.println(a);
		
		char ch1='\u00A7';
		int c=ch1;
		System.out.println(c);
		
		double d1=33.22f;
		long l=(long)d1;
		System.out.println(l);
		
		long l1=7654328765432789l;
		int i1=(int)l1;
		System.out.println(i1);
		
		float f1=23.45f;
		int i2=(int)f1;
		System.out.println(i2);
		
		byte b1=75;
		char ch2=(char)b1;
		System.out.println(ch2);

	}

}
