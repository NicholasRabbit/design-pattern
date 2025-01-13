
/*
* 状态实现类之一，订单状态。
*/
public class OrderState implements LogisticsState{

	//获取状态信息 
	public void stateInfo(){
		System.out.println("打印订单状态……");
	}

	//状态模式核心。切换状态，也是和策略模式唯一的区别。
	public LogisticsState nextState(){
		//订单状态之后才切换快递状态，这里仅作模拟，具体还是更多的细分步骤。
		return new ExpressState();
	}
}