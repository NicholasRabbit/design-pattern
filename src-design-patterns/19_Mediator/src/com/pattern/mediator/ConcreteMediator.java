package com.pattern.mediator;

import com.pattern.colleague.*;
import java.util.*;


//中介实现类
public class ConcreteMediator extends Mediator{
	
	private Map<String,Colleague> colleagueMap;
	
	//初始化Map
	public ConcreteMediator(){
		colleagueMap = new HashMap<String,Colleague>();
	}
	
	//把“同事”类注册进来，这里以放到Map的形式注册。
	public void register(String name,Colleague colleague){
		colleagueMap.put(name,colleague);
	}

	//转发消息,注意这个发送给其它人，不用发送给本人
	public void relayMsg(String msg,String name){
		
		Set<Map.Entry<String,Colleague>> entrySet = colleagueMap.entrySet();
		Iterator<Map.Entry<String,Colleague>> itr = entrySet.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Colleague>  node = itr.next();
			String nameOfColleague = node.getKey();
			//发送给其它同事消息
			if(nameOfColleague != name){
				node.getValue().receiveMsg(msg);
			}

		}


	}

}