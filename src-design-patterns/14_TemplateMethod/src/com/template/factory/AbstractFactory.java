
package com.template.factory;

import com.template.entity.*;

import java.io.*;
import java.util.*;


//抽象类
//不要写成接口，因为这里还要写具体实现的方法
public abstract class AbstractFactory {

	//父类中的模板方法，这里规定好了程序执行的顺序，用final修饰，子类只能继承，不能重写
	public final void manufacture(){
		//这里规定好制造顺序
		while(true){	
			String carMake = getCarMake();
			createCar(carMake);
			prepare();
			cnc();
			painting();
			assembly();
		}
		
	}
	
	//用protected修饰，子类重写时用public。重写的方法权限可以更大不能更小（复习）。
	protected abstract Vehicle createCar(String carMake);  //制造指定车型的车

	protected abstract void prepare();

	protected abstract void cnc();

	protected abstract void painting();

	protected abstract void assembly();

	//接受命令行输入的车型，本方法跟设计模式无关
	private String getCarMake(){
		
		BufferedReader reader = null;
		InputStreamReader input = null;
		try{
			input = new InputStreamReader(System.in); 
			reader = new BufferedReader(input);
			System.out.println("请输入车型：例：F150/LC");
			String carMake = reader.readLine();
			return carMake;
		
		}catch(IOException e){
			e.printStackTrace();
			return "";   //try catch总有一个会执行。
		}finally{
			//循环输入不需要关闭流
			/*if(input != null){
				try{
					input.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if(reader != null){
				try{
					reader.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}*/
			
		}
	}

}
