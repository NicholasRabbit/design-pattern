package com.prototype.deep;

import java.io.*;

public class Sheep implements Cloneable,Serializable{

	private final static long serialNo = 2L;

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
			//(1)先完成基本类型属性和String类型的克隆
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

	/**
	*2，通过序列化的方式实现深拷贝（推荐）；
	*/
	public Object deepCloneBySerialize(){
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		try{
			//序列化对象
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			//反序列化对象
			bais = new ByteArrayInputStream(baos.toByteArray());
			ois = new ObjectInputStream(bais);
			Sheep sheepDeep = (Sheep)ois.readObject();
			return sheepDeep;

		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			try{
				baos.close();
				oos.close();
				bais.close();
				ois.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		

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
