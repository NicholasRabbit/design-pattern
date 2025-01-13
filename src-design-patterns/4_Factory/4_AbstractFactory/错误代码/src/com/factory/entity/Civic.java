package com.factory.entity;

//国产卡罗拉
public class Civic extends Vehicle{
	
	public void prepare(){
		setCarMake("civic");
		System.out.println("preparing to manufacturing " + carMake);
	}
}