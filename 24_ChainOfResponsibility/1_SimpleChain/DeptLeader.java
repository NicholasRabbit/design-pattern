
//部门负责人
public class DeptLeader extends AbstractBugetHandler {

	/*
	* 处理预算请求，如果超过5000则提交到上级领导
	*/
	public boolean checkBuget(int money){
		if(money <= 5000){
			System.out.println("DeptLeader had approved.");
			return true;
		}else{
			getNextHandler().checkBuget(money);
			return false;
		}
	}
}