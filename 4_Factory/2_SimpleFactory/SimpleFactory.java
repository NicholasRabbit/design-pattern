
/*
简单工厂模式：
工厂类，把原来在BuyCar.java中创建Vehicle对象的方法封装到这里
以后增加新的类只需要新写一个类，然后在这里修改加个else if语句即可，别的地方从这里获取这个类就行。
*/
public class SimpleFactory {

	//第一种方式
	//一，实例方法，简单工厂模式只有一个创建对象的方法，使用if-else来区分判断不同的对象。
	//工厂方法则是一个产品一个方法，或者一类产品一个方法。
	public Vehicle createVehicle(String carMake){
		Vehicle v = null;
		System.out.println("执行简单工厂模式");
		if(carMake.equals("vios")){
			v = new Vios();
			v.setCarMake("vios");
		}else if(carMake.equals("corrolla")){
			v = new Corrolla();
			v.setCarMake("corrolla");
		}else if(carMake.equals("prado")){  //新增加个车型
			v = new Prado();
			v.setCarMake("prado");
		}

		return v;
	}

	//第二种方式
	//二，静态方法
	public static Vehicle createVehicleStatic(String carMake){
		Vehicle v = null;
		System.out.println("执行简单工厂模式");
		if(carMake.equals("vios")){
			v = new Vios();
			v.setCarMake("vios");
		}else if(carMake.equals("corrolla")){
			v = new Corrolla();
			v.setCarMake("corrolla");
		}else if(carMake.equals("prado")){  //新增加个车型
			v = new Prado();
			v.setCarMake("prado");
		}

		return v;
	}
	
}
