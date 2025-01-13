
/*
合成复用原则：
尽量使用合成，聚合的方式，而不是继承来实现功能，因为继承就增加了子类和父类的耦合性；

*/

public class CompositeReuseTest001 {

	public static void main(String[] args){
		Car car = new Car();
		Vehicle v = new Vehicle();
		car.doSome(v);
	}
}



class Vehicle {

	public void run(){
		System.out.println("vehicle run");	
	}
}

class Car {
	
	//这里没有继承Vehicle，而是把它聚合在了Car里，这样减少了和Vehicle的耦合
	public void doSome(Vehicle vehi){
		vehi.run();
	}

}