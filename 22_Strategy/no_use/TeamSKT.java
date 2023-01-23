
/*
* 战队，在这里执行相关策略
*/
public class TeamSKT {

	
	/*
	* 战队开始打游戏
	* 如果要增加策略，就得修改代码，耦合性太强。
	*/
	public void playGame(int i){
		if(i == 1){
			System.out.println("稳健运营策略……");
		}else if(i == 2){
			System.out.println("进攻策略……");
		}else{
			System.out.println("无此策略");
		}

		
	}

}