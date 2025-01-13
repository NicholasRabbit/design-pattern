
/*
* 战队，在这里执行相关策略
*/
public class TeamSKT {

	private GameStrategy gameStrategy;

	public void setGameStrategy(GameStrategy gameStrategy){
		this.gameStrategy = gameStrategy;
	}

	//战队开始打游戏
	public void playGame(){
		gameStrategy.fightStrategy();
	}

}