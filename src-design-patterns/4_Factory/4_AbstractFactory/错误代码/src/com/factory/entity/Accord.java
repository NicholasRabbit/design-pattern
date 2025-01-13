package com.factory.entity;

//国产卡罗拉
public class Accord extends Vehicle{
	
	public void prepare(){
		setCarMake("accord");
		System.out.println("preparing to manufacturing " + carMake);
	}
}