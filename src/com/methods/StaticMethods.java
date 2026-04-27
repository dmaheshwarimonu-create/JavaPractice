package com.methods;

public class StaticMethods {

// --static main method----- 
	public static void main(String[] args) {
		System.out.println("static Main method");
			
		//static mth method direct calling
		mth();
		
		//static mth method direct calling
		mth1();
			}
	
	
//static mth method creation
	 static void mth() {
		
		System.out.println("static mth method");
		
		//static mth1 method direct calling in static mth method
		mth1();

	}
	 
	//static mth1 method creation
	 static void mth1() {
			
			System.out.println("static mth1 method");

		}

}
