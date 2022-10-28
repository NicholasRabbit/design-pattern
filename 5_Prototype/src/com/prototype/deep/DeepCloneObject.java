package com.prototype.deep;

import java.io.Serializable;

//深拷贝对象类
public class DeepCloneObject implements Serializable,Cloneable{

    private final static long serializeNo = 1L;  //第二种深拷贝方法要用到序列化的方式。

    private int id;
    private String name;
    
	public DeepCloneObject(){
	
	}
	public DeepCloneObject(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    

    protected Object clone() throws CloneNotSupportedException{
        DeepCloneObject dco = null;
		try{
			dco = (DeepCloneObject)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		return dco;
    }

    @Override
    public String toString() {
        return "DeepCloneObject [id=" + id + ", name=" + name + "]";
    }

    
    

}