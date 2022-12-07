
package com.decorator.food;

/*
* 主食类
* 这里不要用具体的主食直接继承Food抽象类，而是把主食进一步抽象成主食类再继承Food
*/

public abstract class StapleFood extends Food {

	
	public String toString(){
		return "{" + getDescription() + "，价格：" + getPrice() + "}";
	}

	public double cost(){
		return super.getPrice();   //这里获取父类的价格，因为其子类初始化时给这个父类的属性price赋值了。
	}

}