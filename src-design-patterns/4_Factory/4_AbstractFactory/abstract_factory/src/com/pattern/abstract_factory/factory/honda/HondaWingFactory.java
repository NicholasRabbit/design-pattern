package com.pattern.abstract_factory.factory.honda;

import com.pattern.abstract_factory.entity.motor.CBR1000RR;
import com.pattern.abstract_factory.entity.motor.Motorcycle;

//本田摩托工厂
public class HondaWingFactory extends HondaFactory{
    @Override
    public Motorcycle createMotorcycle() {
        return new CBR1000RR("Honda wing","CBR1000RR");
    }
}
