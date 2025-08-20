package com.tnsif.Day6.staticblockmethod;

public class MyClass {
	private int section; // non static
	private static int srNo; // static
	//static block representation
	{
		System.out.println("---within static block---");
		srNo=1000;
	}

	//default constructor
	{
		System.out.println("----within default constructor---");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	static void display()
	{
		System.out.println("serial no: "+srNo);
	}

}
