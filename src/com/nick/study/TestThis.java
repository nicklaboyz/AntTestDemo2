package com.nick.study;

import com.nick.encapsulation.Human;

public class TestThis {
	
	int a,b,c;
	
	TestThis(int a,int b){
		this.a = a;
		this.b = b;
		
	}
	
	TestThis(int a,int b,int c){
		this(a,b);   //构造器的调用必须位于第一句
		this.c = c;
	}
	
	void sing() {
		System.out.println("hello nick!!!");
	}
	
	void eat() {
		this.sing();
		System.out.println("喊你回家吃饭");
	}
	public static void main(String[] args) {
		TestThis hi = new TestThis(1,2,3);
		hi.eat();
		System.out.println(hi.a);
		System.out.println(hi.b);
		System.out.println(hi.c);
	}

}
