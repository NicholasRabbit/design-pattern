package com.template;

import com.template.entity.*;
import com.template.factory.*;


/*
* 重写一个工厂方法模式，因为工厂方法是就属于模板方法模式
* 为了理解模板方法，这里把原来Vehicle类里的制造过程的方法挪到AbstractFactory及其子类里
*/
public class TemplateMethodTest {

	public static void main(String[] args){
		
		AbstractFactory  factory = new ImportCarFactory();
		factory.manufacture();

	}

}