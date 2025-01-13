package com.decorator.decor;

import com.decorator.food.*;

//装饰者实现类
public class Meat extends Decorator{

	{
		setPrice(15.00D);   //These methods are in Food.java.
		setDescription("肉卤");
	}

	public Meat(){
	
	}

	public Meat(Food food){
		super(food);  //给父类Decorator有参构造参数赋值。
	}


}
