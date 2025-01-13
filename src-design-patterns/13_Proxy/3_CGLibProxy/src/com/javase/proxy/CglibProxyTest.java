
package com.javase.proxy;

/*
* Cglib代理模式，属于动态代理
* 它使用ASM框架来读取class字节码文件。
* 区别：
* Cglib代理的对象不需要实现接口，只是一个独立的类就可以被代理
* 使用JDK的动态代理方式，被代理的对象需要实现一个接口。
*
* 需要用到CgLib和ASM相关的jar包。
* 本例引入外部jar包出现问题，"final can't override"
* 原因：引入的cglib版本和asm版本不适配
*/

public class CglibProxyTest {

	
	public static void main(String[] args){
		
		Calculator target = new Calculator();
		ProxyCglibFactory pcf = new ProxyCglibFactory(target);
		Calculator cal = (Calculator)pcf.getProxyInstance();

		cal.add(10,6);
	}


}