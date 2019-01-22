package com.nick.study;

public class TestSuper2 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象");
		new ChildClass2();
		
	}

}

class FatherClass2{
	public FatherClass2() {
		System.out.println("创建fatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	public ChildClass2() {
		super();  //所有子类构造器的调用都会有这一句,先调用父类构造器,写不写都会存在
		System.out.println("创建ChildClass");
	}
}