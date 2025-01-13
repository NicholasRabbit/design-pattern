package com.factory.order;

import com.factory.entity.*;

public class HondaFactory implements AbstractFactory {

	public Vehicle createCar(String carMake){
		Vehicle vehicle = null;
		if("civic".equals(carMake)){
			vehicle = new Civic();
		}else if("accord".equals(carMake)){
			vehicle = new Accord();
		}

		return vehicle;
			

	}


}