
package com.template.entity;

//汽车抽象类
public abstract class Vehicle {

	protected String carMake;

	public void setCarMake(String carMake){
		this.carMake = carMake;
	}
	public String getCarMake(){
		return this.carMake;
	}

}