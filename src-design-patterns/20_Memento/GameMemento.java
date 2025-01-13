
//备忘录实现类
public class GameMemento implements Memento{
	//保存的进度分数
	private int score;
	//对应游戏的名字
	private String name;

	public GameMemento(){
	
	}
	public GameMemento(int score,String name){
		this.score = score;
		this.name = name;
	}
	
	//对于score,name只能有get不能set,因为这里只是用来保存分数的，没有权限修改。
	public int getScore(){
		return this.score;
	}
	public String getName(){
		return this.name;
	}

}