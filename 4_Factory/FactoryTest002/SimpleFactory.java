
/*
工厂类，把原来在BuyCar.java中创建Vehicle对象的方法封装到这里
以后增加新的类只需要在这里修改，别的地方从这里获取这个类就行。
*/
public class SimpleFactory {

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
}
