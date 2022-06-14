
/*
1,本例使用简单工厂模式（也称静态工厂模式）；
2,主要代码具体见工厂类SimpleFactory.java；
3,这里尽心买车的操作；
*/

public class FactoryStoreTest {

	public static void main(String[] args){
		//一，调用工厂内实例方法
		//new BuyCar(new SimpleFactory());	
		
		//二，调用工厂内的静态方法的形式
		new BuyCarStatic();
	}
}