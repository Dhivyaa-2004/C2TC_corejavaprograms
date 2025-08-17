package com.tnsif.Day2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'b';
		switch(a) {
		case 'k':
		case 'K':
			System.out.println("kind");
			break;
		
		case 'd':
		case 'D':
			System.out.println("divine");
			break;
		case 'a':
		case 'A':
			System.out.println("abundant");
			default:
				System.out.println("none");
			
		}


	}

}
