package com.factory_method.factory;

import com.factory_method.entity.*;

//国产车订购的类，工厂类
public class DomesticCarFactory extends CarFactoryAbstract {

	//JDK的Calender.java里createCalendar(TimeZone zone,Locale aLocale)也是用的工厂方法，和这里一样。
    public Vehicle createCar(String carMake){
		
		Vehicle car = null;
		
		if("corrolla".equals(carMake)){
			car = new Corrolla();
		}else if("prado".equals(carMake)){
			car = new Prado();
		}

		return car;
    }

}