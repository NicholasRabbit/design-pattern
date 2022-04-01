
/*
本例使用简单工厂模式（也称静态工厂模式）
具体见SimpleFactory.java
*/

public class FactoryTest002 {

	public static void main(String[] args){
		new BuyCar(new SimpleFactory());	
	}
}