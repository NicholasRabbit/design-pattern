
/*
* 需要保存进度的实现类
*/
public class GameOriginator implements Originator{
	//保存的分数
	private int score;
	//游戏的名称
	private String name;

	public GameOriginator(){
	
	}
	
	public GameOriginator(int score,String name){
		this.score = score;
		this.name = name;
	}

	/*
	* 保存分数，实际返回的是一个备忘录实现类，这个类里保存着分数，
	* 然后再把GameMemento保存到CareTaker的Map属性里。
	*/
	public Memento saveScore(int score){
		return new GameMemento(score,this.name);  
	}
	//关键部分，恢复分数，结合CareTaker总的
	public void recoverScore(Memento memento){
		this.score = memento.getScore();
		this.name = memento.getName();
	}

	public int getScore(){
		return this.score;
	}
}