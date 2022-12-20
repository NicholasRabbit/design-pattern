package com.javase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

	//被代理的对象
	private Object target;

	public ProxyFactory(){
	
	}
	public ProxyFactory(Object target){
		this.target = target;
	}

	//获取被代理的对象
	public Object getProxyInstance(){

		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();

		/*
		* 匿名内部类，实际在这里实现了被代理对象的方法，并且添加了额外的打印日志功能，这就是使用代理模式的目的。
		* */
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//代理类增加了打印计算日志的功能
				LogUtil.beforeHandler(method.getName(), Arrays.toString(args));
				Object result = method.invoke(target, args);//反射机制
				//打印结果日志
				LogUtil.afterHandler(method.getName(),result);
				return result;
			}
		};

		Object instance = Proxy.newProxyInstance(classLoader, interfaces, handler);
		return instance;

	}
}