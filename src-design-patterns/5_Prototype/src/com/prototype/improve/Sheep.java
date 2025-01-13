package com.prototype.improve;

public class Sheep implements Cloneable{

	private int no;
	private String name;
	private double weight;
	private Sheep sussan;   //被克隆的对象的的属性是一个引用数据类型

	public Sheep(){
	
	}
	public Sheep(int no,String name,Double weight){
		this.no = no;
		this.name = name;
		this.weight = weight;
	}

	public void setNo(int no){
		this.no = no;
	}
	public int getNo(){
		return this.no;
	}
	
	public void setName(String name){
		this.name = name;;
	}
	public String getName(){
		return this.name;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}

	public String toString(){
		return "Sheep :{id=" + no + ", name=" + name + ", weight=" + weight + "}";
	}

	public void setSussan(Sheep sussan){
		this.sussan = sussan;
	}
	public Sheep getSussan(){
		return this.sussan;
	}

	
	//重写Object的clone方法
	protected Object clone(){
		Sheep sheep = null;
		try{
			sheep = (Sheep)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		return sheep;
	}
	

}