
/*
简单工厂模式：注意：简单工厂不属于23种设计模式，工厂方法和抽象工厂属于。
1,本例使用简单工厂模式（也称静态工厂模式）；
2,主要代码具体见工厂类SimpleFactory.java；
3,这里进行买车的操作；

简单工厂模式的不足：
1,如果要增加新类型的产品就得修改SimpleFactory.java中的代码，不符合OCP原则；
2,新类型过多造成SimpleFactory.java难以维护，而且不符合单一职责原则；
改善：
使用工厂方法模式可改善此问题。
*/

public class FactoryStoreTest {

	public static void main(String[] args){
		//一，调用工厂内实例方法
		//new BuyCar(new SimpleFactory());	
		
		//二，调用工厂内的静态方法的形式
		new BuyCarStatic();
	}
}