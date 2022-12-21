
package com.template.factory;

import com.template.entity.*;

public class ImportCarFactory extends AbstractFactory {

	
	//制造指定车型的车
	public Vehicle createCar(String carMake){
		if("LC".equals(carMake)){
			System.out.println("import LandCrusirer");
			return new LandCrusier();
		}else if("F150".equals(carMake)){
			System.out.println("import F150");
			return new F150();
		}else{
			return null;
		}
	}  
	
	public void prepare(){
		System.out.println("import prepare");
	}

	public void cnc(){
		System.out.println("import cnc");
	}

	public void painting(){
		System.out.println("import painting");
	}

	public void assembly(){
		System.out.println("import assembly");
	}
}