package com.pattern.abstract_factory.factory.honda;

import com.pattern.abstract_factory.entity.car.Civic;
import com.pattern.abstract_factory.entity.car.Vehicle;

//本田汽车工厂
public class HondaCarFactory extends HondaFactory{
    @Override
    public Vehicle createCar() {
        return new Civic("Honda","Civic");
    }
}
