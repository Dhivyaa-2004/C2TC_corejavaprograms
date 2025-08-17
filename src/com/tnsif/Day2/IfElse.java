package com.tnsif.Day2;
import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if (x%2== 0) {
			System.out.println("Value of x is EVEN");
		}
		else {
			System.out.println("Value of x is ODD");	
		}
		
	}
}
