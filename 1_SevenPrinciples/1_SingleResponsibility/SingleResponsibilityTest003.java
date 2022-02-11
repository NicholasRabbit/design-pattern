/*
解决方案2的：在方法层面执行单一职责原则，虽然一般要求在类层面区分职责，但是当功能不是很多时，使用方法来区分也可以。
*/

public class SingleResponsibilityTest003 {
	
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.run("汽车");
		v.fly("飞机");
		v.cruise("轮船");
	}
}

class Vehicle{
	//多写一个方法来分担职责
	public void run(String vehicle){
		System.out.println(vehicle + "==>在公路上跑。");
	}

	public void fly(String vehicle){
		System.out.println(vehicle + "==>在天上飞。");
	}

	public void cruise(String vehicle){
		System.out.println(vehicle + "==>在水里航行。");
	}


}