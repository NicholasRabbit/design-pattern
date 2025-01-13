
package com.decorator.meal;

import com.decorator.food.*;

//主食类，被装饰者
public class Rice extends StapleFood{

	//实例代码块
	{
		setDescription("主食：大米");
		setPrice(2.00D);
	}

	public Rice(){
	
	}

}