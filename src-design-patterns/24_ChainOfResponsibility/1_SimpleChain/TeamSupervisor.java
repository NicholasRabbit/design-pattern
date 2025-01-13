
//组领导
public class TeamSupervisor extends AbstractBugetHandler{
	
	/*
	* 处理预算请求，如果超过1000则提交到上级领导
	*/
	public boolean checkBuget(int money){
		if(money <= 1000){
			System.out.println("TeamSupervisor had approved.");
			return true;
		}else{
			getNextHandler().checkBuget(money);
			return false;
		}
	}


}