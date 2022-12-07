
package com.decorator.food;

//抽象类
public abstract class Food {
	
	//私有的属性不能被子类继承，但子类可继承下面公共的set,get方法来使用这些私有属性。
	private String description;
	private double price;

	//抽象方法，由子类实现
	public abstract double cost();

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return this.price;
	}


}