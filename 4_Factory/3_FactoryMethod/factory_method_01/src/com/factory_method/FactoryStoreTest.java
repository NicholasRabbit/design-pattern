package com.factory_method;
/*
一，看一个新的需求，来说明简单工厂模式的不足
	如果客户要买国外的这种corrolla车型，怎么做？(增加了新类型的的产品)
	1，按照上例的简单工厂模式，就得在SimpleFactory.java的createVehicle(..)再增加代码，不符合OCP原则。
	2，单一工厂SimpleFactory.java里负责的类型太多，不符合单一职责原则。

二，解决上面的问题可使用工厂方法模式，把简单工厂中创建对象的方法改为一个或同一类型对象对应一个工厂类。

三，工厂方法模式实际也是属于模板方法模式这个大类。

四，三种工厂方法的区别
 简单工厂（一个方法）：使用使用if-else来区分判断不同的对象。
 工厂方法（很多方法）：每个产品或每类产品一个方法。
 抽象工厂：很多工厂+很多方法。

*/

//手动编译运行命令：
// factory-method-1--> javac -encoding utf-8 -d build  src/com/factory_method/FactoryStoreTest.java  src/com/factory_method/factory/*.java src/com/factory_method/entity/*.java
// build--> java com.factory_method.FactoryStoreTest

import com.factory_method.factory.CarFactoryAbstract;
import com.factory_method.factory.DomesticCarFactory;
import com.factory_method.factory.ForeignCarFactory;

//注意，编译时执行 javac -encoding utf-8 FactoryStoreTest.java即可，不用*.java
public class FactoryStoreTest {

	public static void main(String[] args){
		
		String location = "foreign";
		
		if("foreign".equals(location)){
			//买进口车型
			System.out.println("下面买进口车型");
			//子类实例化时，其无参构造方法默认有个super()去调用父类的无参构造，而父类中的无参构造调用了toBuyCar()方法
			CarFactoryAbstract buyCar = new ForeignCarFactory();
		}else if("domestic".equals(location)){
			//买国产的车型
			System.out.println("下面买国产车型");
			CarFactoryAbstract buyCar = new DomesticCarFactory();
		}
		
		
	}
}