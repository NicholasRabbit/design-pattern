package com.pattern.abstract_factory;

import com.pattern.abstract_factory.entity.car.Vehicle;
import com.pattern.abstract_factory.entity.motor.Motorcycle;
import com.pattern.abstract_factory.factory.FactoryInterface;
import com.pattern.abstract_factory.factory.honda.HondaCarFactory;
import com.pattern.abstract_factory.factory.honda.HondaWingFactory;
import com.pattern.abstract_factory.factory.toyota.ToyotaCarFactory;
import com.pattern.abstract_factory.factory.toyota.ToyotaMotorFactory;

/*
* 抽象工厂方法模式：
* 工厂方法模式有个弊端，如果我这个厂要生产摩托车怎么办？工厂方法则需要修改代码，不符合OCP原则。
* 抽象工厂方法模式就是针对这一情况的改善。
* 具体做法：
* 1，把造车和造摩托的方法都写在接口里，用抽象工厂类实现，
* 然后写具体的类实现这个抽象工厂，摩托车厂就实现造摩托方法，汽车厂就实现造汽车方法。
* 2，实际是在工厂方法的基础上把工厂做了进一步抽象，用增加工厂类的方式来替代在类里增加多个建造方法。
* 3，在接口里提前都写好了多种建造方法，相当于总厂，如果要再增加建造别的东西怎么办？那只有在总厂里加了，设计模式只是改善不能十全十美，一点不让你改代码……
*
* 注意：工厂方法和抽象方法模式属于23种设计模式，简单工厂模式不属于。
* */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        //获取丰田汽车工厂
        FactoryInterface toyotaCarFactory = new ToyotaCarFactory();
        //建造汽车
        Vehicle corolla = toyotaCarFactory.createCar();
        System.out.println("corolla==>" + corolla);
        //获取摩托车工厂
        FactoryInterface toyotaMotorFactory = new ToyotaMotorFactory();
        //建造摩托车
        Motorcycle yzfr1 = toyotaMotorFactory.createMotorcycle();
        System.out.println("R1==>" + yzfr1);

        //同理对本田进行操作
        FactoryInterface hondaCarFactory = new HondaCarFactory();
        Vehicle civic = hondaCarFactory.createCar();
        System.out.println("civic==>" + civic);
        FactoryInterface hondaMotorFactory = new HondaWingFactory();
        Motorcycle cbr1000rr = hondaMotorFactory.createMotorcycle();
        System.out.println("cbr1000rr==>" + cbr1000rr);


    }
}
