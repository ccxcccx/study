package com.study.server;

public class Demo {
	
	public static String a="1";
	
	public static void main(String[] args) {
		Demo demo1 = new Demo();
		demo1.a="2";
		Demo demo2 = new Demo();
		System.out.println(demo2.a);
	}
	
}
