
/*
* 游戏新闻类，在这里更新新闻给各个观察者
* 本例不使用观察者模式，增加一个人获取消息，就得修改GameNews里的代码
* 耦合性强，违反了OCP原则。
*/
public class GameNews {


	private String news;

	private NeoTvOb neo;

	//第一处，修改代码，增加PluTvOb
	private PluTvOb plu;

	public GameNews(){
	
	}
	public GameNews(String news){
		this.news = news;
	}
	

	public void notifyNews(){
		neo.update(news);
		//修改第二处
		plu.update(news);
	}

	public void setNeo(NeoTvOb neo){
		this.neo = neo;
	}

	//修改的第三处
	public void setPlu(PluTvOb plu){
		this.plu = plu;
	}

}