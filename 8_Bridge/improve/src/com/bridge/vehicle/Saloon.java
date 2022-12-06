
package com.bridge.vehicle;

import com.bridge.brand.*;

public class Saloon extends Vehicle {

	public Saloon(){
	
	}
	public Saloon(Brand brand){
		super(brand);  //给父类的构造方法赋值
	}

	public void start(){
		super.start();  //调用父类的方法
		System.out.println("saloon start");
	}
	public void transmit(){
		super.transmit();
		System.out.println("saloon transmit");
	}
	public void accelerate(){
		super.accelerate();
		System.out.println("saloon accelerate");
	}

}