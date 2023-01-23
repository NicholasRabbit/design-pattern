
/*
* 快递状态，状态实现类之一。
*/
public class ExpressState implements LogisticsState{

	//获取状态信息 
	public void stateInfo(){
		//在这里进行更新快递状态的操作
		System.out.println("打印快递状态……");
	}

	//状态模式核心。切换状态，也是和策略模式唯一的区别。
	public LogisticsState nextState(){
		//物流状态之后是更新库存状态，具体还有更多的细分步骤。
		return new WarehouseState();
	}

}