package com.factory.order;

import com.factory.entity.*;

public class ToyotaFactory implements AbstractFactory {

	public Vehicle createCar(String carMake){		
		Vehicle vehicle = null;
		if("corrolla".equals(carMake)){
			vehicle = new Corrolla();
		}else if("prado".equals(carMake)){
			vehicle = new Prado(); 
		}

		return vehicle;
	
	}

}