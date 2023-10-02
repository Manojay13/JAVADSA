package com.apress.prospring5.ch2.prog2;

class HelloWorldWithCommnadLine{
	public static void main(String[] args){
	if(args.length>0)
		System.out.println(args[0]);
	else 
		System.out.println("Hello World!");	
	}
}
