
package com.decorator.decor;

import com.decorator.food.*;

public class Vegetables extends Decorator {

	{
		setPrice(6.00D);
		setDescription("蔬菜卤");
	}

	public Vegetables(){
	
	}

	public Vegetables(Food food){
		super(food);  //给父类Decorator有参构造参数赋值。
	}
}
