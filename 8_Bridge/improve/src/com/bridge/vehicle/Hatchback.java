
package com.bridge.vehicle;

import com.bridge.brand.*;

public class Hatchback extends Vehicle {
	
	
	public Hatchback(){
	
	}
	public Hatchback(Brand brand){
		super(brand);  //给父类的构造方法赋值
	}
	
	public void start(){
		super.start();  
		System.out.println("hatchback start");
	}
	public void transmit(){
		super.transmit();
		System.out.println("hatchback transmit");
	}
	public void accelerate(){
		super.accelerate();
		System.out.println("hatchback accelerate");
	}

}