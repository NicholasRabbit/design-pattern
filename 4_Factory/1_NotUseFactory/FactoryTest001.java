
/*
不使用工厂模式的例子：
问题：
1，如果我要添加一个车型，就得修改BuyCar.java里的代码，违反了OCP原则，耦合性太强；
2，如果只是一处修改使用Vehicle及其子类的代码还可以，当软件开发中大量用到这些类时，那么改动就设计了多处，如此以来就很麻烦。
3，改进创建一个工厂类，其内部有个方法专门创建这些类，见FactoryTest002
*/

public class FactoryTest001 {

	public static void main(String[] args){
		new BuyCar();  //构造方法里执行购买车的操作
	}
}