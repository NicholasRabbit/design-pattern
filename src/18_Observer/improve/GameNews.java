
import java.util.*;

/*
* 使用观察者模式，进行改进。
*/
public class GameNews implements Subjects{


	private String news;

	private List<Observers> observers;

	public GameNews(){
	
	}
	public GameNews(String news){
		this.news = news;
	}


	//添加观察者，以后每增加一个观察者调用此方法添加到集合里即可，不用再修改GameNews的代码了
	public void add(Observers ob){
		this.observers.add(ob);
	}
	//移除观察者，也不用修改这里的代码。
	public void remove(Observers ob){
		this.observers.remove(ob);
	}
		
	
	//重点改进：在这里使用集合的方式遍历通知观察者
	public void notifyNews(){
		for(Observers ob : observers){
			ob.update(news);
		}
	}

	public void setObservers(List<Observers> observers){
		this.observers = observers;
	}



}