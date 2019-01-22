package com.nick.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 12;   //private定义的变量只能在本类中使用
		h.name = "nick";  //name为default属性,不能被不同包的类访问
		h.sayAge();
		
		PersonEncapsulation p4 = new PersonEncapsulation();
//		p4.age = 14;
		p4.setAge(25);  //设置p4.age的实参
		System.out.println(p4.getAge());
		p4.getName();   //获得p4的name
	}
}

class Boy extends Human{
	void sayHello() {
//		System.out.println(age); //子类无法调用父类的私有属性和方法
	}
}

class Girl extends Human{
	void sayGood() {
		System.out.println(height);
	}
}
