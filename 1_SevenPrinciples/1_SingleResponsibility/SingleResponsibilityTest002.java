
/*
1,针对001的改进，即一个类负责一个运输工具，在类的层面实现职责的划分。
2,
*/
public class SingleResponsibilityTest002 {
	
	public static void main(String[] args){
		Car car = new Car();
		car.run("汽车");
		AirPlane plane = new AirPlane();
		plane.fly("飞机");
		Ship ship = new Ship();
		ship.cruise("轮船");
	}
}


class Car{
	public void run(String vehicle){
		System.out.println(vehicle + "==>在公路上跑。");
	}
}


class AirPlane{
	public void fly(String vehicle){
		System.out.println(vehicle + "==>在天上飞。");
	}
}

class Ship{
	public void cruise(String vehicle){
		System.out.println(vehicle + "==>在水里航行。");
	}
}
