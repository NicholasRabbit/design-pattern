
//单一职责原则一般要求在类的层面实现职责的区分，但有时也可以在方法的层面实现（例：003）

//单一职责原则范例1，这里模拟不遵守单一职责出现的问题
//本例出现的问题：一个类有太多职责，输出结果“飞机在公路上跑”，显然不对
//解决方法见002：让一个类负责一个职责，即遵守单一职责原则
public class SingleResponsibilityTest001 {
	
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.run("汽车");
		v.run("飞机");
		v.run("轮船");
	}
}

class Vehicle{

	public void run(String vehicle){
		System.out.println(vehicle + "==>在公路上跑。");
	}
}