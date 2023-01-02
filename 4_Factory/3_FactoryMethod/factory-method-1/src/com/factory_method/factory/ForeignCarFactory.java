package com.factory_method.factory;

import com.factory_method.entity.*;

//工厂类
public class ForeignCarFactory extends CarFactoryAbstract {

    public Vehicle createCar(String carMake){
		Vehicle car = null;
		if("corrolla import".equals(carMake)){
			return new CorrollaImport();
		}else if("prado import".equals(carMake)){
			return new PradoImport();
		}
		return car;

    }

}