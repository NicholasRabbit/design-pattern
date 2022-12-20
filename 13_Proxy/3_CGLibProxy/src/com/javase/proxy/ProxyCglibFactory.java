
package com.javase.proxy;

import java.lang.reflect.Method;
import java.util.*;

//CgLib的依赖
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
//Log4j
import org.apache.log4j.Logger;

public class ProxyCglibFactory implements MethodInterceptor {
	
	private final static Logger logger = Logger.getLogger(ProxyCglibFactory.class);
	
	//被代理的目标对象
	private Object target;

	public ProxyCglibFactory (){
		
	}

	public ProxyCglibFactory (Object target){
		this.target = target;
	}

	/*
	实现接口方法，在这里会调用被代理对像target的方法。
	=====
	cglib官方文档
	Parameters:
    obj - "this", the enhanced object
    method - intercepted Method
    args - argument array; primitive types are wrapped
    proxy - used to invoke super (non-intercepted method); may be called as many times as needed 
	*/
	public Object intercept(Object obj,Method method,Object[] args,MethodProxy proxy) throws Throwable{
	
		logger.info("cglib start");  //log4j
		//代理类增加了打印计算日志的功能
		LogUtil.beforeHandler(method.getName(), Arrays.toString(args));  //手写日志工具
		
		//利用反射机制，调用原对象的方法
		Object result = method.invoke(target, args);//反射机制
		//打印结果日志
		LogUtil.afterHandler(method.getName(),result);
		
		logger.info("cglib stop");  //log4j
		return result;

	}
	
	
	//获取代理对象	
	public Object getProxyInstance(){
	
		//1，创建一个工具类，这个工具用来指定父类
		Enhancer enhancer = new Enhancer();
		//2，指定父类
		enhancer.setSuperclass(target.getClass());
		//3，设置回调函数
		enhancer.setCallback(this);
		//4，创建子类对象，即代理对象，用来代理target的方法
		Object proxyInstance = enhancer.create();

		return proxyInstance;
	}


}