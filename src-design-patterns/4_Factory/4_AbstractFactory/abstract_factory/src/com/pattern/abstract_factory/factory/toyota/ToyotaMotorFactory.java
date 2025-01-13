package com.pattern.abstract_factory.factory.toyota;

import com.pattern.abstract_factory.entity.motor.Motorcycle;
import com.pattern.abstract_factory.entity.motor.YZF_R1;

//丰田摩托车工厂类
public class ToyotaMotorFactory extends ToyotaFactory {

    @Override
    public Motorcycle createMotorcycle() {
        return new YZF_R1("Yamaha","R1");  //和雅马哈合作……
    }
}
