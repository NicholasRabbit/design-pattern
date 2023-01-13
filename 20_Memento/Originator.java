
//需要保存进度的对象接口
public interface Originator {
	
	//保存分数
	public abstract Memento saveScore(int score);
	//恢复分数
	public abstract void recoverScore(Memento memento);
	
	//获取分数
	public abstract int getScore();

}