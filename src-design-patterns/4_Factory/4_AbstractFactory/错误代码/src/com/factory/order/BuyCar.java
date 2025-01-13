package com.factory.order;

import com.factory.entity.*;
import java.io.*;
import java.util.*;

public class BuyCar {
	
	AbstractFactory factory;

	public BuyCar(){
	
	}
	public BuyCar(AbstractFactory factory){
		setFactory(factory);
	}
	
	public void setFactory(AbstractFactory factory){
		Vehicle v = null;
		String carMake = ""; //用户输入车型
		this.factory = factory;
		do{
			carMake = getCarBrand();
			v = factory.createCar(carMake);
			if(v != null){
				v.prepare();
				v.cnc();
				v.painting();
				v.assembly();
			}else{
				System.out.println("目前无此车型！！");
				break;
			}
		}while(true);
	}


	//终端接收客户输入的车型
	private String getCarBrand(){
		try{
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入车品牌，例：corrolla/civic：");
			String carMake = strIn.readLine();
			return carMake;
		}catch(IOException e){
			e.printStackTrace();
			return "";  //try, catch里总有一个return执行，所以写这里可以
		}
		
	}

}