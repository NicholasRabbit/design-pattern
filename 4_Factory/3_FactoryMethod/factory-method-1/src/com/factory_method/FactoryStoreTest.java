package com.factory_method;
/*
一，看一个新的需求，来说明简单工厂模式的不足
	如果客户要买国外的这种corrolla车型，怎么做？(增加了新类型的的产品)
	1，按照上例的简单工厂模式，就得在SimpleFactory.java的createVehicle(..)再增加代码，不符合OCP原则。
	2，单一工厂SimpleFactory.java里负责的类型太多，不符合单一职责原则。

二，解决上面的问题可使用工厂方法模式，即再BuyCarAbstract.java创建一个抽象的制造汽车的方法
   然后由具体的实现类的createCar(..)来制造不同的车，即把实例化的操作在子类完成；
   每增加一个类型，就增加一个工厂类，对扩展开放，对修改关闭，符合单一职责和OCP原则。
   例如：本例我想要合资车就增加一个合资工厂类即可

三，工厂方法模式实际也是属于模板方法模式这个大类。

四，这里可以把具体产生的汽车看作项目中需要的类的对象。
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