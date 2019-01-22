package com.nick.polymorphism;
/**
 * 测试多态
 * @author nick
 * 多态指同一个方法调用,由于对象不同可靠会有不同的行为
 * 现实生活中,同一个方法,具体实现会完全不同
 * 多态的要点:
 * 1.多态是方法的多态,不是属性的多态(多态与属性无关)
 * 2.多态的存在要有3个必要条件:继承,方法重写,父类引用指向子类对象
 * 3.父类引用指向子类对象后,用该父类引用调用子类重写的方法,此时多态就出现了
 */

public class TestPolymorphism {

	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Dog d = new Dog();
		animalCry(d);
		animalCry(new Cat());  //与上一句不同的写法
	}	
    //多态的方法：父类引用指向子类对象
	static void animalCry(Animal a) {  
		a.shout();
	}
	//没有多态的情况下需要重载的方法这样写
//	static void animalCry(Dog a) {
//		a.shout();
//	}
	//没有多态的情况下需要重载的方法这样写，动物如果很多的情况下代码就很庞大
//	static void animalCry(Cat a) {
//		a.shout();
//	}
}
	
	class Animal{
		public void shout() {
			System.out.println("叫了一声！");
		}
	}
	
	class Dog extends Animal{       //继承
		public void shout() {
			System.out.println("汪汪汪！");  //方法重写
		}
	}
	
	class Cat extends Animal{     //继承
		public void shout() {
			System.out.println("喵喵喵！");   //方法重写
		}
	}

