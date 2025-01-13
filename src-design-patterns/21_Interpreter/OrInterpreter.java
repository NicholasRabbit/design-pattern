
/*
* 组合解释器，实际就是or判断，只要满足city或type任意一个条件即可免门票
*/
public class OrInterpreter extends AbstractInterpreter{
	
	private AbstractInterpreter city;
	private AbstractInterpreter type;
	
	
	public OrInterpreter(){
	
	}
	
	public OrInterpreter(AbstractInterpreter city,AbstractInterpreter type){
		this.city = city;
		this.type = type;
	}
	
	
	//重写父类方法，只要满足一个条件就返回true
	public boolean interpret(String userInfo){
		return city.interpret(userInfo) || type.interpret(userInfo);
	}


}