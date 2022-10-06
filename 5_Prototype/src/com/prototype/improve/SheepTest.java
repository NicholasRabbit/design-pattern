package com.prototype.improve;


/*
1，什么是原型模式？
(1)是一种对象的创建模式。
(2)用原型实例指定创建对象的种类，通过复制这些原型，创建新的对象，而不是从一个类new一个对象。
如果没需要一个对象就去new的话，太占用开销，没必要，可以通过直接复制或克隆这个对象(使用clone()方法)，减少JVM的类加载，创建对象的过程。
(3)这种模式允许创建一个跟原来的对象一样的可定制对象，无需关心创建过程。
*/


public class SheepTest {

	public static void main(String[] args){
		/*
		*/
		Sheep sheep = new Sheep(1001,"Tom",20.5);
		Sheep sheep1 = (Sheep)sheep.clone();
		Sheep sheep2 = (Sheep)sheep.clone();
		System.out.println("sheep1==>" + sheep1 + ",hashCode" + sheep1.hashCode());  //toSthring()值一样，hashCode值不一样
		System.out.println("sheep2==>" + sheep2 + ",hashCode" + sheep2.hashCode());

		
	}
}