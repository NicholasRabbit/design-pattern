package com.dp.builder.improve;

/**
 * 建造房子的抽象类，这里定义建造过程，和房子进行的分离
 * 具体类型的房子建造者实现此抽象类即可
 * */
public abstract class AbstractHouseBuilder {
	
	protected House house = new House();  //House和本抽象类是组合关系
	
	public abstract void baseBuild();
	public abstract void wallBuild();
	public abstract void roofHeight();
	
	public House build() {
		return house;
	}
	

}
