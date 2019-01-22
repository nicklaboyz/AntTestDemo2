package com.nick.array;

/**
 * 测试数组的三种初始化放式
 * 
 * @author Nick
 *
 */

public class TestArray2 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = { 2, 5, 23 };
		User[] b = { 
					new User(1001, "Kate"), 
					new User(1002, "Rose"), 
					new User(1002, "Kobe") 
					};
		
		//默认初始化
		//默认给数组的元素进行赋值，赋值的规则和成员变量默认赋值规则一样
		int[] c = new int[3];//默认值：0，0，0
		boolean[] d = new boolean[2];//默认值：false，false
		String[] s = new String[2];//默认值:null,null
		
		//动态初始化
		int[] a1 = new int[2];
		a1[0] = 1;
		a1[1] = 2;
	}

}
