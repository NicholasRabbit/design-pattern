
/*
1,���001�ĸĽ�����һ���ฺ��һ�����乤�ߣ�����Ĳ���ʵ��ְ��Ļ��֡�
2,
*/
public class SingleResponsibilityTest002 {
	
	public static void main(String[] args){
		Car car = new Car();
		car.run("����");
		AirPlane plane = new AirPlane();
		plane.fly("�ɻ�");
		Ship ship = new Ship();
		ship.cruise("�ִ�");
	}
}


class Car{
	public void run(String vehicle){
		System.out.println(vehicle + "==>�ڹ�·���ܡ�");
	}
}


class AirPlane{
	public void fly(String vehicle){
		System.out.println(vehicle + "==>�����Ϸɡ�");
	}
}

class Ship{
	public void cruise(String vehicle){
		System.out.println(vehicle + "==>��ˮ�ﺽ�С�");
	}
}
