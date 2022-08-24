import java.io.*;
import java.util.*;

public abstract class BuyCarAbstract {

   //写一个抽象方法，由具体的子类去实现，去确定制造国内或国外的什么品牌的车
   public abstract Vehicle createCar(String carMake);

   public BuyCarAbstract(){
		toBuyCar();	  
   }
	
   public void toBuyCar(){
		String carMake=null;
		Vehicle v = null;
		do{
			//获取用户输入的车型
			carMake=getCarBrand();
			
			//调用BuyCar.java子类的方法，来制造指定的车型
			v = createCar(carMake);  
			
			//进行车的准备加工制造操作
			if(v != null){
				v.prepare();
				v.cnc();
				v.painting();
				v.assembly();
			}else{
				System.out.println("买车失败！请输入正确的车型！");
			}	
		} while (true);
	}

	
	//终端接收客户输入的车型
	private String getCarBrand(){
		try{
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入车品牌，例：国产corrolla，进口corrolla import：");
			String carMake = strIn.readLine();
			return carMake;
		}catch(IOException e){
			e.printStackTrace();
			return "";  //try, catch里总有一个return执行，所以写这里可以
		}
		
	}

}