package com.factory_method.entity;

public class Prado extends Vehicle{
	
	public void prepare(){
		setCarMake("Prado");
		System.out.println("preparing to manufacturing " + carMake );
	}
}