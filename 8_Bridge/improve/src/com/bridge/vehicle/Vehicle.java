
package com.bridge.vehicle;

import com.bridge.brand.*;

//“桥”的抽象类
public abstract class Vehicle {
	
	//聚合Brand类
	private Brand brand;  

	public Vehicle(){
	
	}
	//初始化赋值
	public Vehicle(Brand brand){
		this.brand = brand;
	}

	//写上跟Brand里同名的方法，然后使用brand来调用它本来的对应方法
	public void start(){
		this.brand.start();
	}
	public void transmit(){
		this.brand.transmit();
	}
	public void accelerate(){
		this.accelerate();
	}

}