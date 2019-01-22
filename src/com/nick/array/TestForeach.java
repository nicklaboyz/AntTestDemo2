package com.nick.array;
/**
 * 测试foreach循环
 * @author Administrator
 *
 */
public class TestForeach {
	public static void main(String[] args) {
		String[] ss = {"aaa","bbb","ccc","ddd"};
		//foreach循环，用于读取数组元素的值，不能修改元素的值
		for(String temp:ss) {
			System.out.println(temp);
		}
	}

}
