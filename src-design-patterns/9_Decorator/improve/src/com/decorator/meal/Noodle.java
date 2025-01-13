
package com.decorator.meal;

import com.decorator.food.*;

//主食，被装饰者
public class Noodle extends StapleFood{
	
	//实例代码块
	{
		setDescription("主食：面条");
		setPrice(7.00D);
	}

	public Noodle(){
	
	}

}