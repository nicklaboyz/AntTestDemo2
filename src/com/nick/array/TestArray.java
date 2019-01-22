package com.nick.array;

public class TestArray {
	public static void main(String[] args) {
		//索引下标[0~length-1]：0,1,2,3,4,5,6,7,8,9
		int[] arr01 = new int[10];  //长度为10，数组里面可以放10个int变量
		String[] arr02 = new String[5];
		
		
		arr01[0] = 12;
		arr01[1] = 18;
		arr01[2] = 22;
//		arr01[10] = 88;  java.lang.ArrayIndexOutOfBoundsException
		
		//通过循环初始化数组
		for(int i=0;i<arr01.length;i++) {
			arr01[i] = 10*i;			
		}
		//通过循环读取数组里面元素的值
		for(int i=0;i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[3];
		arr03[0] = new User(1001,"Nick");
		arr03[1] = new User(1002,"Peter");
		arr03[2] = new User(1003,"Mary");
		
		for(int i=0;i<arr03.length;i++) {
			System.out.println(arr03[i].getName());
		}
		
	}

}

