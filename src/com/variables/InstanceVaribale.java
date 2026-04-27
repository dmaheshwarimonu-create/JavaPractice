package com.variables;

public class InstanceVaribale {

	static int a = 10;// class level static variables global level
	int b = 20;// class level instance variables global level

	public static void main(String[] args) {

		int c = 30;// local variable for storing data

		System.out.println(c);// local variable direct printing

		System.out.println(a);// class level static variable direct printing

		// InstanceMethod class object creation
		InstanceVaribale im = new InstanceVaribale();

		System.out.println(im.b);// class instance variable printing object reference

	}

}
