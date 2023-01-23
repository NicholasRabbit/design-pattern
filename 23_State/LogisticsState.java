
/*
* State角色，接口
*/
public interface LogisticsState {
	
	//获取状态信息 
	public abstract void stateInfo();

	//状态模式核心。切换状态，也是和策略模式唯一的区别。
	public abstract LogisticsState nextState();


}