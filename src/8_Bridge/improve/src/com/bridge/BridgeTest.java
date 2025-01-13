package com.bridge;

import com.bridge.brand.*;
import com.bridge.vehicle.*;
/*
* 使用桥接模式
*/
public class BridgeTest {

	public static void main(String[] args){
		
		//1,执行Saloon三厢轿车Benz品牌的操作
		Brand benz = new Benz();
		Vehicle saloon = new Saloon(benz);
		saloon.start();
		
		/*
		* 2,如果增加一个车类型Hatchback(两厢)，直接写个类继承Vehicle就行了，原有的Benz类的接口Brand.interface和Hatchback父类Vehicle聚合了，自然Hatchback也可以用
		* 不像使用桥接模式的范例一样，还得在Hactchback下写个Benz的类
		*/
		Vehicle hatchback = new Hatchback(benz);
		hatchback.start();
		
		/*
		* 3,如果再增加一个品牌的车Tesla，也不用每个车型下都加一个品牌，直接新建一个Tesla品牌类继承Brand接口就行了
		*   余下的操作和上面的一样
		*/
		Brand tesla = new Tesla();
		Vehicle saloon2 = new Saloon(tesla);
		saloon2.start();

		/*
		* 总结:
		* 品牌和车型之间有一道无形的桥连接起来了，各自添加子类后可以互相配合。
		* 
		*/


	}
}