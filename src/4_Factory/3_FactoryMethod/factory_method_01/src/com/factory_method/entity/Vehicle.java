package com.factory_method.entity;

public abstract class Vehicle {

    protected String carMake;  //车品牌

	//准备指定车型所需的部件,不同的车不同，因此有具体的车重写该方法
	public abstract void prepare();  

	//制造汽车步骤
	//1,nc加工
	public void cnc(){
		System.out.println(carMake + "==>CNC");	
	}
	//2,喷漆
	public void painting(){
		System.out.println(carMake + "==>buy component");
	}
	//3,组装
	public void assembly(){
		System.out.println(carMake + "==>Assembley");
	}

	public void setCarMake(String carMake){
		this.carMake = carMake;
	}

}