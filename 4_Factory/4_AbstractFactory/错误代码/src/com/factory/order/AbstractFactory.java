package com.factory.order;

import com.factory.entity.*;

public interface AbstractFactory {

	public abstract Vehicle createCar(String carMake);

}