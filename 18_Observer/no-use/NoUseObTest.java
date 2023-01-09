

//不使用观察者模式，增加一个人获取消息，就得修改GameNews里的代码
public class NoUseObTest {
	
	public static void main(String[] args){
		
		GameNews news = new GameNews("WCG final: Jaedong 3:0 F91");
		news.setNeo(new NeoTvOb());
		//news.notifyNews();
		news.setPlu(new PluTvOb());
		news.notifyNews();

	}
	
}