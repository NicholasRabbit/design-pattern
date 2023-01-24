package com.pattern.factory;

import com.pattern.factory.car_factory.FactoryInterface;
import com.pattern.factory.car_factory.Honda;
import com.pattern.factory.car_factory.ToyotaFactory;
import com.pattern.factory.entity.Vehicle;

/*
* 简单工厂的弊端：如果新增车型就得修改简单工厂类里的方法，增加if else语句，不符合OCP原则。
* 使用工厂方法模式可以去除这种弊端，进行改善。
* 具体做法：
* 设置一个工厂接口，给一种车配一种工厂继承工厂接口，以后每增加一种车就增加一个工厂类即可。
* 优点：减少了耦合。
* 缺点：类增多了。
* */
public class FactoryMethodTest {

    public static void main(String[] args) {
        FactoryInterface toyota = new ToyotaFactory();
        Vehicle corolla = toyota.createCar();
        System.out.println("corolla==>" + corolla);
        //增加本田工厂
        FactoryInterface honda = new Honda();
        Vehicle civic = honda.createCar();
        System.out.println("civic==>" + civic);
    }
}
