package com.nick.study;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		String pwd;
		
		User u1 = new User(1000,"nick","123456");
		User u2 = new User(1000,"luoming","123456");
		
		System.out.println(u1 == u2);  //false，值不同
		System.out.println(u1.equals(u2)); //true，id相同
		
		String str1 = new String("windows");
		String str2 = new String("windows");
		System.out.println(str1 == str2);     //false，对象不同
		System.out.println(str1.equals(str2));  //true,内容相同
	}

}

class User{
	int id;
	String name;
	String pwd;
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
    //右键source->Generate hashCode() and Equals(),自动生成下列代码
	//重写是以id为参照，只要判断id相同，就认为两者相同
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
