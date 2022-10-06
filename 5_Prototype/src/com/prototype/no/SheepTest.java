package com.prototype.no;

public class SheepTest {

	public static void main(String[] args){
		/*
		* 一般做法，不是用原型模式：
		* 其他羊以s为原型，复制其内的属性。
		*/
		Sheep s = new Sheep(1001,"Tom",20.5);
		Sheep s1 = new Sheep(s.getNo(),s.getName(),s.getWeight());
		Sheep s2 = new Sheep(s.getNo(),s.getName(),s.getWeight());
		Sheep s3 = new Sheep(s.getNo(),s.getName(),s.getWeight());
		System.out.println("s1==>" + s1);
		System.out.println("s2==>" + s2);
		System.out.println("s3==>" + s3);
	}
}