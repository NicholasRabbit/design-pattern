
/*
* 职责链中的对象的抽象类。
* 处理预算。
*/
public abstract class AbstractBugetHandler {
	
	//下一个处理对象
	private AbstractBugetHandler nextHandler;

	/*
	* 处理预算请求
	*/
	public abstract boolean checkBuget(int money);

	//设置下一个
	public void setNextHandler(AbstractBugetHandler nextHandler){
		this.nextHandler = nextHandler;
	}

	public AbstractBugetHandler getNextHandler(){
		return this.nextHandler;
	}

}