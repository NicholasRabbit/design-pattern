
//观察者实现类
public class PluTvOb implements Observers {

	public void update(String news){
		System.out.println("Plu获得新闻：游戏结果==>" + news);
	}
}