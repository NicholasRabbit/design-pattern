

/*
* 不使用策略模式，查看其弊端。
* 所有的游戏策略都写在战队类里，代码耦合性太强，
* 一个战队里承担了多个角色，违反了单一职责原则。
*/
public class NoStrategyTest {

	public static void main(String[] args){
		
		TeamSKT t = new TeamSKT();
		t.playGame(1);

	}

}