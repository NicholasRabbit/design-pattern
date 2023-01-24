package com.pattern.factory.car_factory;

import com.pattern.factory.entity.Corolla;
import com.pattern.factory.entity.Vehicle;

//工厂实现类
public class ToyotaFactory implements FactoryInterface {
    /*
    * 这里也可以进行扩展，加上形参，根据参数来返回Toyota的不同车型，不多写，重点关注工厂方法的主干写法。
    * */
    @Override
    public Vehicle createCar() {
        return new Corolla("丰田","Corolla");
    }
}
