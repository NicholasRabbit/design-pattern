
/*
工厂类，把原来在BuyCar.java中创建Vehicle对象的方法封装到这里
以后增加新的类只需要新写一个类，然后在这里修改加个else if语句即可，别的地方从这里获取这个类就行。
*/
public class SimpleFactory {

	//一，实例方法
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
