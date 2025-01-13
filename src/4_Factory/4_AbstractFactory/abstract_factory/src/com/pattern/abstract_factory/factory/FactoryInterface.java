package com.pattern.abstract_factory.factory;

import com.pattern.abstract_factory.entity.car.Vehicle;
import com.pattern.abstract_factory.entity.motor.Motorcycle;

//工厂接口
public interface FactoryInterface {

    //建造汽车
    Vehicle createCar();
    //建造摩托车
    Motorcycle createMotorcycle();
}
