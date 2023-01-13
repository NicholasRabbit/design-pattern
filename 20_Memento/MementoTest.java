

/*
* 备忘录模式范例：
* 需求，我打一个游戏，保存了多轮的分数，我想恢复任意一轮的分数。
* 
* 总结：
* 备忘录模式对每个游戏Originator状态都有一个Memento实现类，在这个实现类中保存分数等进度。
* 实际Memento只知道自己需要保存哪些参数，而对Originator内部其它参数是见不着的。最大限度
* 的减少了耦合，符合设计模式的一贯原则。
*/

public class MementoTest {

	public static void main(String[] args){
		
		CareTaker careTaker = new CareTaker();

		//第一轮分数
		Originator game = new GameOriginator(67,"round 1"); //这里round 1就是保存的进度名字，恢复时的标识。
		//把分数存进备忘录，保存进度
		Memento mr1 = game.saveScore(game.getScore());
		careTaker.add(mr1);
		System.out.println("round 1==>" + game.getScore());

		//第二轮分数
		game = new GameOriginator(107,"round 2");
		//把分数存进备忘录，保存第二轮进度
		Memento mr2 = game.saveScore(game.getScore());
		careTaker.add(mr2);
		System.out.println("round 2==>" + game.getScore());
		
		//恢复第一轮分数
		Memento recoverMem = careTaker.getScore("round 1"); //根据名称找到对应的备忘录
		game.recoverScore(recoverMem);
		System.out.println("round 1 recovery ==>" + game.getScore());

	
	}
	
}