
package com.pattern.colleague;

import com.pattern.mediator.*;

//“同事”抽象类
public abstract class Colleague {
	
	//中介者的父类，抽象类
	private Mediator mediator;
	//“同事”名称
	private String name;
	//要发送的消息
	private String msg;


	public Colleague(){
	
	}
	
	//对象实例化的时候，把自己注册到中介者里。
	public Colleague(String name, Mediator mediator){
		this.name = name;
		this.mediator = mediator;
	}

	//获取中介者
	public Mediator getMediator(){
		return this.mediator;
	}

	//发送消息
	public abstract void sendMsg(String msg);

	//接收消息
	public abstract void receiveMsg(String msg);

	//获取名称
	public String getName(){
		return this.name;
	}

	//消息setter,getter
	public void setMsg(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}



}