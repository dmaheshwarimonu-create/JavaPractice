package com.methods;

public class InstanceMethod {

	public static void main(String[] args) {
		
		System.out.println("static main method");//print statement
		
		//InstanceMethod class object creation
		InstanceMethod im=new InstanceMethod();
		
		
		//instance mth method calling by object reference
		im.mth();

		//instance mth1 method calling by object reference
		im.mth1();
	}
	
	//instance mth method creation
    void mth(){
    	System.out.println("instance mth method");
    	
    	//instance mth1 method direct calling in instance mth method 
    	mth1();
		
	}
	
  //instance mth1 method creation
    void mth1(){
    	System.out.println("instance mth1 method");
		
	}

}
