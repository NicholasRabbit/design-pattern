
package com.decorator.decor;

import com.decorator.food.*;

/*
* 装饰者类，继承了Food，同时Food组合到了这里
*/
public class Decorator extends Food {
	//组合Food
	private Food food;

	public Decorator(){
	
	}
	//给组合的属性food初始化赋值
	public Decorator(Food food){
		this.food = food;
	}

	//计算总价，重写父类方法，计算装饰者，即这些配菜的价格
	public double cost(){
		//主食的价格
		double mainCost = food.cost();
		//装饰者-配菜的价格
		//这里获取父类属性的price值，因为子类初始化是调用setPrice(..)，是用了父类的私有属性price并赋值于它，详见Decorator的子类
		double decorPrice = super.getPrice();   
		//返回总价
		return mainCost + decorPrice;

	}
	
	//获取描述信息
	public String getDescription(){
		//输出装饰者的描述和被装饰者的描述
		//return getDescription() + food.getDescription();  //这里方法递归调用自己，会内存栈满。
		return "decor:" + super.getDescription();
	}

	//重写toString()，子类也会继承此方法，不用重写了。
	public String toString(){
		//注意，这里不是调用getPrice(),而是调用cost()方法，是获取总价
		return "{" + getDescription() + "，价格：" + cost() + "}";  
	}


}