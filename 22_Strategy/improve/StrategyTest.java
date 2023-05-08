

/*
* 策略模式
* 对第一种普通写法使用策略模式改进。
* 1，优点：
*	 策略模式把策略和使用者解耦了，同时一个策略一个类，符合单一职责原则；
*    如果要增加新的策略则直接写个新的类实现GameStrategy接口即可，也符合OCP原则。      
* 2，缺点：类的数量增加了。
* 
* 当你写代码的时候发现一个操作有好多种实现方法，而你需要根据不同的情况使用if-else等分支结构来确定使用哪种实现方式的时候，
* 想一想这个模式。https://blog.csdn.net/ShuSheng0007/article/details/88085445
*/
public class StrategyTest {

	public static void main(String[] args){
		
		TeamSKT team = new TeamSKT();
		//执行稳健运营的策略
		GameStrategy stable = new StableStrategy();
		team.setGameStrategy(stable);
		team.playGame();
		//扩展一个激进的游戏策略
		GameStrategy aggressive = new AggressiveStrategy();
		team.setGameStrategy(aggressive);
		team.playGame();
	}

}