package com.nt.test;

public class Demo {
	
	public static String wishMsg(){
		return "Good Evening";
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello, how r u?");
		System.out.println("bye bye...");
		
		wishMsg();
		
		CountryandLanguage cl=new CountryandLanguage();
		cl.m1();
		cl.m2();
		
	}

}
