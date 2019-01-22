package com.nick.study;

public class TestObject {
	public static void main(String[] args) {
		Object obj;
		TestObject to = new TestObject();
/*
Object类定义有public String toString()方法，其返回值是String类型，
object类中toString方法的源码为：
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
*/
		System.out.println(to.toString());
	}
	
	public String toString() {
		return "重写toString,测试Object对象";
	}

}
