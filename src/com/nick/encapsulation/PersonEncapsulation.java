package com.nick.encapsulation;

/**
 * 测试封装
 * @author Nick
 * 类的属性的处理：
 * 1.一般使用private访问权限
 * 2.提供get/set方法来访问相关属性，这些方法通常是public修饰的，
 * 以提供对属性的赋值与读取操作（注意：boolean变量的get方法是is开头）
 * 3.一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰
 */
public class PersonEncapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	//属性私有可以使用set方法，作为对外调用的控制
	public void setAge(int age) {
		if(age>=1&&age<=120) {
		this.age = age;
		}else {
			System.out.println("请输入正常的年龄");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
