package com.nt.test;

public class Demo {
	
	public static String wishMsg(){
		return "Good Evening";
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello, how r u?");
		System.out.println("bye bye...");
		System.out.println("i am fine...");
		System.out.println("i am also fine");
		
		
		wishMsg();
		
		CountryandLanguage cl=new CountryandLanguage();
		cl.m1();
		cl.m2();
	
		
		ThirdModification tm=new ThirdModification();
		tm.m3();
		tm.m4();
		
		FourthMod fm=new FourthMod();
		fm.m5();
		
	}

}
