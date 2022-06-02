
import java.util.*;
import java.io.*;

//增加一个SimpleFactory属性，可以调用它的方法来产生一个类型的车，让用户购买
public class BuyCar {
	
	Vehicle v;
	SimpleFactory  simpleFactory;
	
	
	public BuyCar(SimpleFactory  simpleFactory){
		toBuyCar(simpleFactory);
	}

	public void toBuyCar(SimpleFactory  simpleFactory){
		String carMake=null;
		do{
			//获取用户输入的车型
			carMake=getCarMake();
			//从简单工厂类中获取指定车型，解耦合了，代替了原来不是用工厂模式的new对象的操作，
			v = simpleFactory.createVehicle(carMake);  
			//进行车的准备加工制造操作
			if(v != null){
				v.prepare();
				v.cnc();
				v.buyComponent();
				v.assembly();
			}else{
				System.out.println("买车失败！请输入正确的车型！");
				break;
			}	
		} while (true);
	}

	private String getCarMake(){
		try{
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入车型：");
			String carMake = strIn.readLine();
			return carMake;
		}catch(IOException e){
			e.printStackTrace();
			return "";  //try, catch里总有一个return执行，所以写这里可以
		}
		
	}
}