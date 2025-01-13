
//Context角色
public class TmallGoodsInfo {

	private LogisticsState state;
	
	//查询订单状态
	public void checkStateInfo(){
		state.stateInfo();
	}

	public void setState(LogisticsState state){
		this.state = state;
	}
}