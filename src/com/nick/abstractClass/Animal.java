package com.nick.abstractClass;

public abstract class Animal {
	String str;  //定义普通属性
	public abstract void run();  //声明抽象方法
	
	//定义普通方法
	public void breath() {
		System.out.println("呼吸");
		run();
	}

}
class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("猫步小跑");
		
	}
	
class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("汪汪叫");
		
	}
	
}
	
}
