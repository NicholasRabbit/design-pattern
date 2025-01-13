

package com.pattern.colleague;

import com.pattern.mediator.*;


//“同事”实现类。
public class Feiqiu extends Colleague{

	public Feiqiu(){
	
	}
	/*
	* "同事"类初始化的时候，设定好名称，同时把自己注册到中介者里。
	*/
	public Feiqiu(String name,Mediator mediator){
		super(name,mediator);
		mediator.register(name,this);
	}
	
	/*
	* 发送消息，实际这里是调用中介者里的转发消息方法relayMsg(..)，把消息发送给其他"同事"。
	*/
	public void sendMsg(String msg){
		setMsg(msg);
		this.getMediator().relayMsg(msg,getName());
	}

	//接受其它“同事”发送的消息
	public void receiveMsg(String msg){
		System.out.println("Feiqiu receive==>" + msg);
	}

}