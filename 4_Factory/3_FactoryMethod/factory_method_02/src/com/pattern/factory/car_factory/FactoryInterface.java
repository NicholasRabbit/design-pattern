package com.pattern.factory.car_factory;

import com.pattern.factory.entity.Vehicle;

//对工厂
public interface FactoryInterface {

    public abstract Vehicle createCar();
}
