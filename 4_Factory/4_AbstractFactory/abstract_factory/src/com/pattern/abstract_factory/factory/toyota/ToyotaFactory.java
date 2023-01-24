package com.pattern.abstract_factory.factory.toyota;

import com.pattern.abstract_factory.entity.car.Vehicle;
import com.pattern.abstract_factory.entity.motor.Motorcycle;
import com.pattern.abstract_factory.factory.FactoryInterface;

/*
* 丰田总厂抽象类，实现FactoryInterface接口。
* 因为是抽象类，可以做个缓冲，把接口的方法空实现，当子类继承本抽象类时，可选择实现其中的方法。
* 汽车厂可以实现造车方法，摩托车厂可以实现造摩托车方法，抽象工厂的核心就在于此。
* */
public abstract class ToyotaFactory implements FactoryInterface {

    //对接口的方法进行空实现，留给子类去选择完成具体实现
    @Override
    public Vehicle createCar(){
        return null;
    }

    @Override
    public Motorcycle createMotorcycle(){
        return null;
    }
}
