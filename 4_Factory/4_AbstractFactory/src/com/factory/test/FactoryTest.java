package com.factory.test;

import com.factory.entity.*;
import com.factory.order.*;

/*
* 抽象工厂模式主测试类
* 1，抽象工厂模式将简单工厂模式和工厂方法模式进行了改进，或者称作进一步的抽象；
* 2，这种模式将工厂抽象成两层，程序员可以根据需要的类来创建不用的工厂，如本例中需要corrolla则创建ToyotaFactory.java，
* 需要civic则创建HondaFactory.java。
* 3，这样将单个的简单工厂变成了工厂簇，如果我需要大众品牌的车，则新建一个VolksWagon.java继承AbstractFactory.java
* 在这个工厂类里写生产线管车型的代码即可，这样扩展性更好，便于维护了。
*/

public class FactoryTest {


	public static void main(String[] args){
		//如果我需要丰田工厂的车，则新建一个ToyotaFactory.java类，当作实参传入
		//new BuyCar(new ToyotaFactory());
		//如果需要本田的则新建HondaFactory.java类
		new BuyCar(new HondaFactory());
		
	}
}