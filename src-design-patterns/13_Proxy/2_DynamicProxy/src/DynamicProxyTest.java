package com.javase.proxy;

//动态代理测试类，笔记见 ProxyFactory.java
public class DynamicProxyTest {

    public static void main(String[] args) {

        ICalculator calculator = new Calculator();
        ProxyFactory proxyFactory = new ProxyFactory(calculator);
        ICalculator proxyInstance = (ICalculator) proxyFactory.getProxyInstance();
        System.out.println(proxyInstance);  //结果：com.javase.proxy.Calculator@..说明是反射的Calculator对象
        //直接使用proxyInstance调用方法，会打印日志，说明动态代理添加日志功能起效了。
        proxyInstance.add(10,5);
        proxyInstance.subtract(25,3);
        System.exit(0);

    }


}
