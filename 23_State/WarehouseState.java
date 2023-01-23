
/*
* 库存状态
*/
public class WarehouseState implements LogisticsState{

	//获取状态信息 
	public void stateInfo(){
		//在这里进行更新库存状态的操作
		System.out.println("查看库存状态……");
	}

	//状态模式核心。切换状态，也是和策略模式唯一的区别。
	public LogisticsState nextState(){
		//这里返回null，还可以进行扩展。
		return null;
	}

}