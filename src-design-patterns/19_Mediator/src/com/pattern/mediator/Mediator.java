

package com.pattern.mediator;

import com.pattern.colleague.*;


//中介者父类，抽象类
public abstract class Mediator {

	
	//把“同事”类注册进来，这里以放到Map的形式注册。
	public abstract void register(String name,Colleague colleague);

	//转发消息
	public abstract void relayMsg(String msg,String name);

}