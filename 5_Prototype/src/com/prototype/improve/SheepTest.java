package com.prototype.improve;


/*
1，什么是原型模式？
(1)是一种对象的创建模式。
(2)用原型实例指定创建对象的种类，通过复制这些原型，把原型中属性的值赋予新创建的对象，而不是从一个类new一个对象。
如果每需要一个对象就去new的话，太占用开销，没必要，可以通过直接复制或克隆这个对象(使用clone()方法)，减少JVM的类加载，创建对象的过程。
(3)这种模式允许创建一个跟原来的对象一样的可定制对象，无需关心创建过程。
2，原型模式的浅拷贝：
(1)被克隆的对象内的属性的数据类型是基本数据类型的话，浅拷贝会直接把数值复制到克隆生成的新对象，
   如果属性是引用数据类型，则不会复制一份，而是将引用地址指向原来的位置，见本例中的 Sheep sussan属性的引用地址。
(2)使用默认的clone()方法执行的就是浅拷贝；
*/


public class SheepTest {

	public static void main(String[] args){
		
		prototype();
		shallowCopy();

	}
	//原型模式，简单范例	
	public static void prototype(){
		Sheep sheep = new Sheep(1001,"Tom",20.5);
		Sheep sheep1 = (Sheep)sheep.clone();
		Sheep sheep2 = (Sheep)sheep.clone();
		System.out.println("sheep1==>" + sheep1 + ",hashCode" + sheep1.hashCode());  //toSthring()值一样，hashCode值不一样
		System.out.println("sheep2==>" + sheep2 + ",hashCode" + sheep2.hashCode());
	}

	//测试浅拷贝
	public static void shallowCopy(){
		Sheep sheep = new Sheep(1002,"Jerry",36.5);
		sheep.setSussan(new Sheep(1003,"Sussan",56.6));  //设置sheep对象内引用数据的值。
		Sheep sheep1 = (Sheep)sheep.clone();
		Sheep sheep2 = (Sheep)sheep.clone();
		System.out.println("sheep==>" + sheep + ",sussan==>" + sheep.getSussan().hashCode());
		System.out.println("sheep1==>" + sheep1 + ",sussan==>" + sheep1.getSussan().hashCode());   //sheep1和2的属性Sheep sussan的hashCode值和sheep中的是一样的，说明指向了原型对象sheep中属性的引用。
		System.out.println("sheep2==>" + sheep2 + ",sussan==>" + sheep2.getSussan().hashCode());
	}
}