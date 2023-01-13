
import java.util.*;

//在这里执行保存进度，恢复进度的操作。
public class CareTaker {

	//使用Map来保存多个游戏对象的进度，也可使用List，只是当进度多了以后，List的下标不容易记住。
	private Map<String,Memento> mementoMap;

	public CareTaker(){
		mementoMap = new HashMap<>();
	}

	//添加备忘记录(游戏进度)到 Map中。
	public void add(Memento memento){
		this.mementoMap.put(memento.getName(),memento);
	}

	//关键代码：获取备忘录，通过名字获取备忘录对象，再赋值给原GameOriginator对象来恢复进度。
	public Memento getScore(String mementoName){
		return mementoMap.get(mementoName);
	}
	


}