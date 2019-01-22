package com.nick.study;

public class TestOverride {
	public static void main(String[] args) {
		Person p = new Person("阿牛",22);
		System.out.println(p.toString());

	}
}

class Person {
	String name;
	int age;

	@Override
	public String toString() {
		return name + ",年龄：" + age;
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
}