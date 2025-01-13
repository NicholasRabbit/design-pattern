package com.pattern.abstract_factory.factory.toyota;

import com.pattern.abstract_factory.entity.car.Corolla;
import com.pattern.abstract_factory.entity.car.Vehicle;

//丰田汽车工厂类
public class ToyotaCarFactory extends ToyotaFactory{
    @Override
    public Vehicle createCar() {
        return new Corolla("Toyota","Corolla");
    }
}
