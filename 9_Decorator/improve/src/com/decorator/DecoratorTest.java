
package com.decorator;

import com.decorator.food.*;
import com.decorator.meal.*;
import com.decorator.decor.*;

/*
* 装饰者设计模式：
* 1，不使用装饰者模式出现的问题，类过多，每增加一个餐品组合，就得增加一个类才能求出其价格和描述
* 装饰者模式的思路。
* 2，让Decorator类继承Food，同时把Food作为属性组合到Decorator类里，这样每次需要新的主食加卤子的组和
* 可把主食类作为参数赋值给Decorator类里的food，然后在Decorator类里进行价格的求和，描述的组合等操作。
* 3，实现了OCP原则，即对扩展开放，对修改关闭。
* 装饰者设计模式只需要增加新的类继承Food即可获得不同的主食加配菜的组合。
*/
public class DecoratorTest {

	
	public static void main(String[] args){
		Food rice = new Rice();
		System.out.println(rice.toString());
		System.out.println(rice.cost());

		//获取米饭加肉卤的价格，此处肉卤即为装饰者
		Food meat = new Meat(rice);
		System.out.println(meat);   //输出总价

		//1,如果再增加一个主食，例如Noodle，要获取它和肉卤的价格的话，只需新增一个Noodle类继承Food即可
		Food noodle = new Noodle();
		Food meatAndNoodle = new Meat(noodle);
		System.out.println(meatAndNoodle);

		//2,如果再增加一个卤，也可以按照原Meat类的写法继承Decorator，并写自己的实现等操作
		Food vegetables = new Vegetables(noodle);
		System.out.println(vegetables);

	}


	
}