

/*
* 状态模式：
* 1，状态模式的核心之处在于状态的切换，而且每种状态只能切换到指定的一种或几种状态。
*    例如：订单下单后才会改成下单状态，下单状态再转为快递发送状态，不能直接变为签收完成状态。
* 2，状态模式比策略模式多了一个状态切换，其它地方完全一样。
*/
public class StateTest {

	public static void main(String[] args){
		
		//查询订单状态
		LogisticsState orderState = new OrderState();
		TmallGoodsInfo info = new TmallGoodsInfo();
		info.setState(orderState);
		info.checkStateInfo();

		//切换到快递状态
		LogisticsState expressState = orderState.nextState();
		info.setState(expressState);
		info.checkStateInfo();
		
		//切换到库存状态
		LogisticsState wareHoseState = expressState.nextState();
		info.setState(wareHoseState);
		info.checkStateInfo();
	}
}