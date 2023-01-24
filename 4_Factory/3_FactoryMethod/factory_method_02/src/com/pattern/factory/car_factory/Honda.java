package com.pattern.factory.car_factory;

import com.pattern.factory.entity.Civic;
import com.pattern.factory.entity.Vehicle;

public class Honda implements FactoryInterface {
    @Override
    public Vehicle createCar() {
        return new Civic("Honda","Civic");
    }
}
