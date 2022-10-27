package com.prototype.deep;

public class Sheep implements Cloneable{

	private int no;
	private String name;
	private double weight;
	private DeepCloneObject deepCloneObject;   //被克隆的对象的的属性是一个引用数据类型

	public Sheep(){
	
	}
	public Sheep(int no,String name,Double weight){
		this.no = no;
		this.name = name;
		this.weight = weight;
	}

	

    /**
     * 深拷贝的两种方法
     * 1，把拷贝对象中的引用属性再进行克隆
    */
	protected Object clone(){
		
        Object object = null;
		Sheep sheep = null;
		try{
			//(1)先完成基本属性的克隆
			object = super.clone();
			sheep = (Sheep) object;
			//(2)让属性是对象的再单独进行克隆
			DeepCloneObject deepCloneObject = new DeepCloneObject();
			sheep.deepCloneObject = (DeepCloneObject)deepCloneObject.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
        return sheep;

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

	
	public void setDeepCloneObject(DeepCloneObject deepCloneObject) {
		this.deepCloneObject = deepCloneObject;
	}
    public DeepCloneObject getDeepCloneObject() {
        return deepCloneObject;
    }

	@Override
	public String toString() {
		return "Sheep [no=" + no + ", name=" + name + ", weight=" + weight + "]";
	}

	
	
	
	
	

}