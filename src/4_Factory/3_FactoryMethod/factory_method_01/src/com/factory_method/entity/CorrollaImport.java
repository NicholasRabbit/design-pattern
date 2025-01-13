package com.factory_method.entity;

public class CorrollaImport extends Vehicle{
	

	public void prepare(){
		setCarMake("进口的卡罗拉");
		System.out.println("preparing to manufacturing " + carMake);
	}
}