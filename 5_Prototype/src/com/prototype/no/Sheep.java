package com.prototype.no;

public class Sheep {

	private int no;
	private String name;
	private double weight;

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
	

}