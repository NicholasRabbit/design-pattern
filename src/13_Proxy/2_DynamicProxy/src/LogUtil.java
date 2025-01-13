package com.javase.proxy;

public class LogUtil {

	public static void beforeHandler(String methodName,String numbers) {   //numbers是要进行运算的数
		System.out.println("运算方法："+methodName+"，算数: "+numbers);
	}
	
	public static void afterHandler(String methodName,Object result) {  //result要用Object类型
		System.out.println("运算方法: "+methodName+"，结果==>"+result);
	}
}